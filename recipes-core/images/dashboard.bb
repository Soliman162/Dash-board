# custom-rpi image
require /home/soliman/Embedded_linux/yocto_project/poky/meta/recipes-core/images/core-image-base.bb
require /home/soliman/Embedded_linux/yocto_project/poky/meta/recipes-graphics/images/core-image-x11.bb
#################################################################################################################################

# set image file format
IMAGE_FSTYPES += "wic wic.bz2 wic.bmap"

# Remove old image 
RM_OLD_IMAGE = "1"

# install vim & python3 
IMAGE_INSTALL += "python3 python3-pyqt5 qtbase qtx11extras vim"

# install linux firmware
#IMAGE_INSTALL += "linux-firmware-rpidistro"

IMAGE_INSTALL_append = " systemd systemd-conf"

# Enable systemd
INIT_MANAGER = "systemd"

IMAGE_INSTALL += " kmod"

# install wpa-supplicant
IMAGE_INSTALL_append = " wpa-supplicant"

# enable wifi 
IMAGE_INSTALL += " linux-firmware-rpidistro-bcm43430"

# install dev tools
IMAGE_INSTALL_append = " gcc cmake make gdb ninja"

# install tzdata
IMAGE_INSTALL_append = " tzdata tzdata-africa"

IMAGE_INSTALL_append = " psplash"
IMAGE_FEATURES += " splash "

# install libpng for support png
IMAGE_INSTALL_append = " libpng"

# install x server
IMAGE_INSTALL_append = " x11vnc xserver-xf86-config xserver-xorg"

# install net-tools
IMAGE_INSTALL_append = " net-tools ethtool"

# install kernel modules
IMAGE_INSTALL += " kernel-modules car-ecu-buttons-mod"

IMAGE_INSTALL_append = " photos dash-board"

#install systemd service file
IMAGE_INSTALL_append = "  dash-board-start" 
###############################################

inherit extrausers

EXTRA_USERS_PARAMS = "\
     usermod -p $(openssl passwd RPI_64_root) root; \
 "
