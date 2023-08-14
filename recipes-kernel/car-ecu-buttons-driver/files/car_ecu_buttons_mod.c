#include <linux/module.h>
#include <linux/fs.h>
#include <linux/cdev.h>
#include <linux/init.h>
#include <linux/stat.h>
#include <linux/ioctl.h>
#include <linux/uaccess.h>
#include <linux/gpio.h>
#include <linux/irq.h>

#define GET_BIT(reg,bit)	((reg>>bit)&1)

#define READ_SIZE			8	
#define GPIO_PINS_NUMBER	6

#define PARK_BIT_INDEX					0
#define HORN_BIT_INDEX					1
#define RUNNING_LIGHT_BIT_INDEX 		2
#define HIGHT_LIGHT_BIT_INDEX			3
#define RIGHT_SIGN_BIT_INDEX			4
#define LEFT_SIGN_BIT_INDEX  			5

#define PARK_PIN_NUMBER 			2
#define HORN_PIN_NUMBER 			3
#define RUNNING_LIGHT_PIN_NUMBER    4
#define HIGHT_LIGHT_PIN_NUMBER 		17
#define RIGHT_SIGN_PIN_NUMBER 	 	27
#define LEFT_SIGN_PIN_NUMBER   		22

#define DEVICE_FILE_NAME	(u8 *)"car_ecu_buttons"

struct gpio	BUTTONS_PINS[GPIO_PINS_NUMBER] = {
												{PARK_PIN_NUMBER, GPIOF_DIR_IN , "PARK"},
												{HORN_PIN_NUMBER, GPIOF_DIR_IN , "HORN"},
												
												{RUNNING_LIGHT_PIN_NUMBER, GPIOF_DIR_IN , "RUNNING_LIGHT"},
												{HIGHT_LIGHT_PIN_NUMBER, GPIOF_DIR_IN , "HIGH_LIGHT"},

												{RIGHT_SIGN_PIN_NUMBER, GPIOF_DIR_IN , "RIGHT_SIGN"},
												{LEFT_SIGN_PIN_NUMBER, GPIOF_DIR_IN , "LEFT_SIGN"}
										} ;

struct cdev gpio_devStruct ;
dev_t first_assigned_number = 0;
struct class *device_class;
struct device *device_struct;
unsigned char buffer[READ_SIZE] = "" ; 

int open_module (struct inode *node, struct file *file_mod)
{
	printk("open ecu buttons driver\n");
	return 0;
}

ssize_t read_module (struct file *file_mod, char __user * user_buffer, size_t count, loff_t *offs)
{
	int not_copied = 0;
	u8 label_index = 0;
	
	if( *offs+count > READ_SIZE )
	{
		count = READ_SIZE - *offs;
	}

	for( label_index=PARK_BIT_INDEX;label_index<=LEFT_SIGN_BIT_INDEX;label_index++ )
	{
		buffer[label_index] = (gpio_get_value(BUTTONS_PINS[label_index].gpio) == 0? '0':'1'); 
	}

	buffer[label_index] = '\0';
	buffer[label_index+1] = '\n';

	not_copied = copy_to_user(user_buffer,&buffer[*offs],count);
	if( not_copied )
	{
		return -1;
	}

	printk("data read from buffer\n");
	return count;
}

int close_module (struct inode *node, struct file *file_mod)
{
	printk("close driver\n");
	return 0;
}

struct file_operations file_Op =
{
	.owner = THIS_MODULE,
	.open = open_module ,
	.read = read_module,
	.release = close_module
};


static int __init car_ecu_init(void)
{
	int ret_value = 0;
	ret_value = alloc_chrdev_region(&first_assigned_number,0,(u8)GPIO_PINS_NUMBER,"gpio device");
	if(ret_value != 0)
	{
		printk("couldn't allocate number\n");
		return -1;
	}
	cdev_init(&gpio_devStruct,&file_Op);
	ret_value = cdev_add(&gpio_devStruct,first_assigned_number,GPIO_PINS_NUMBER);
	if(ret_value != 0)
	{
		printk("cdev add faield\n");
		goto DELETE_DEVICE_NUMBER;
	}
	if( (device_class = class_create(THIS_MODULE,"gpio_class")) == NULL )
	{
		printk("device class filed\n");
		goto DELETE_DEVICE_STRUCT;
	}
	device_struct = device_create(device_class,NULL,first_assigned_number,NULL,DEVICE_FILE_NAME);
	if( device_struct == NULL )
	{
		printk("device create failed\n");
		goto DELETE_CLASS;
	}
	ret_value = gpio_request_array(BUTTONS_PINS,GPIO_PINS_NUMBER);
	if( ret_value != 0 )
	{
		printk("gpio request failed\n");
		goto DELETE_STRUCT;
	}

	return 0;

	DELETE_STRUCT:
		device_destroy(device_class,first_assigned_number);
	DELETE_CLASS:
		class_destroy(device_class);
	DELETE_DEVICE_STRUCT:
		cdev_del(&gpio_devStruct);
	DELETE_DEVICE_NUMBER:
		unregister_chrdev_region(first_assigned_number,GPIO_PINS_NUMBER);
		return -1;
}

static void __exit car_ecu_exit(void)
{
	gpio_free_array(BUTTONS_PINS,GPIO_PINS_NUMBER);
	cdev_del(&gpio_devStruct);
	device_destroy(device_class,first_assigned_number);
	class_destroy(device_class);
	unregister_chrdev_region(first_assigned_number,GPIO_PINS_NUMBER);
	printk("stop gpio\n");
}


module_init(car_ecu_init);
module_exit(car_ecu_exit);

MODULE_LICENSE("GPL");
MODULE_AUTHOR("Soliman");
MODULE_DESCRIPTION("Simple device driver for gpio");

