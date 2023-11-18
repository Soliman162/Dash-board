require /home/soliman/Embedded_Linux/yocto_project/poky/meta/recipes-core/images/core-image-base.bb
require /home/soliman/Embedded_Linux/yocto_project/poky/meta/recipes-graphics/images/core-image-x11.bb
#######################################################################################################

# set image file format
IMAGE_FSTYPES += "wic wic.bz2 wic.bmap"

# Remove old image 
RM_OLD_IMAGE = "1"

# install vim & python3 
IMAGE_INSTALL += "python3 python3-pyqt5 qtbase qtx11extras vim"

IMAGE_INSTALL:append = " systemd systemd-conf"

# Enable systemd
INIT_MANAGER = "systemd"

IMAGE_INSTALL += " kmod"

# install wpa-supplicant
IMAGE_INSTALL:append = " wpa-supplicant"

# enable wifi 
IMAGE_INSTALL += " linux-firmware-rpidistro-bcm43430"

# install dev tools
IMAGE_INSTALL:append = " gcc cmake make gdb ninja"

# install tzdata
IMAGE_INSTALL:append = " tzdata tzdata-africa"

IMAGE_INSTALL_:append = " psplash"
IMAGE_FEATURES += " splash "

# install libpng for support png
IMAGE_INSTALL:append = " libpng"

# install x server
IMAGE_INSTALL:append = " x11vnc xserver-xf86-config xserver-xorg xserver-nodm-init"

# install net-tools
IMAGE_INSTALL:append = " net-tools ethtool"

# install kernel modules
IMAGE_INSTALL += " kernel-modules car-ecu-buttons-mod"

IMAGE_INSTALL:append = " photos dash-board"

#install systemd service file
IMAGE_INSTALL:append = "  dash-board-start" 
###############################################

inherit extrausers

EXTRA_USERS_PARAMS = "\
    usermod -p $(openssl passwd RPI_64_root) root; \
 "
