require /home/soliman/Embedded_Linux/yocto_project/poky/meta/recipes-core/images/core-image-base.bb
require /home/soliman/Embedded_Linux/yocto_project/poky/meta/recipes-graphics/images/core-image-x11.bb
#######################################################################################################

# set image file format
IMAGE_FSTYPES += "wic wic.bz2 wic.bmap"

# Remove old image 
RM_OLD_IMAGE = "1"

# install vim & python3 
IMAGE_INSTALL += " qtbase qtx11extras qtconnectivity qtwayland qtdeclarative qtnetworkauth qttools meta-toolchain-qt5"

IMAGE_INSTALL:append = " systemd systemd-conf"

# Enable systemd
INIT_MANAGER = "systemd"

IMAGE_INSTALL += " kmod"

# install wpa-supplicant
IMAGE_INSTALL:append = " wpa-supplicant"

# enable wifi 
IMAGE_INSTALL += " linux-firmware-rpidistro-bcm43430"

# install dev tools
IMAGE_INSTALL:append = " gcc cmake make gdb ninja vim"

# install tzdata
IMAGE_INSTALL:append = " tzdata tzdata-africa"

# install libpng for support png
IMAGE_INSTALL:append = " libpng"

# install x server
IMAGE_INSTALL:append = " x11vnc xserver-xf86-config xserver-xorg xserver-nodm-init"

# install xcb lib
IMAGE_INSTALL:append = " libx11 libxcb xcb-util xcb-util-image wayland"

# install net-tools
IMAGE_INSTALL:append = " net-tools ethtool"

# install kernel modules
IMAGE_INSTALL += " kernel-modules car-ecu-buttons-mod"

IMAGE_INSTALL:append = " openssh dash-board-ui"

###############################################

inherit extrausers

EXTRA_USERS_PARAMS = "\
    usermod -p $(openssl passwd RPI_64_root) root; \
 "
