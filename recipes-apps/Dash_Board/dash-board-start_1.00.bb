LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "dash-board-start.service"

SRC_URI_append = " file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/dash-board-start.service"

S = "${WORKDIR}"

DEPENDS = "systemd"

###inherit pkgconfig autotools systemd features_check
inherit systemd features_check

REQUIRED_DISTRO_FEATURES = "systemd"

do_install_append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/dash-board-start.service ${D}/${systemd_unitdir}/system
}

FILES_${PN} += "${systemd_unitdir}/system/dash-board-start.service"
