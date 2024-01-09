LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "dash-board-start.service"

SRC_URI = " file://dash-board-start.service"

S = "${WORKDIR}"

DEPENDS += " systemd"

inherit systemd features_check

REQUIRED_DISTRO_FEATURES = "systemd"

do_install:append () {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 dash-board-start.service ${D}/${systemd_unitdir}/system
}

FILES_${PN} += "${systemd_unitdir}/system/dash-board-start.service"
