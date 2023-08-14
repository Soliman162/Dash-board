# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
#LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file:///home/soliman/Embedded_linux/yocto_project/meta-customrpi/recipes-apps/Dash_Board/files/dash_board.py"

SRC_URI[md5sum] = "07dce43127ca737d8984fb787a4c18ef"

RDEPENDS_${PN} = " python3 python3-pyserial python3-pyqt5 qtserialport qtconnectivity qtbase qtx11extras qtserialbus"

S = "${WORKDIR}"

do_install(){
    install -d ${D}/home/images
    install -m 0777 /home/soliman/Embedded_linux/yocto_project/meta-customrpi/recipes-apps/Dash_Board/files/dash_board.py ${D}/home/images
}

FILES_${PN} += "home/images/dash_board.py"
