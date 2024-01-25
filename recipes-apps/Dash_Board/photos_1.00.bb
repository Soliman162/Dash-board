
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

SRC_URI = " \
            file://Images/EVER.png \
            file://Images/High_light.png \
            file://Images/Horn.png \
            file://Images/Neutrino_logo.png \
            file://Images/Park.png \
            file://Images/Runing_light.png \
            file://Images/Turn_left_0.png \
            file://Images/Turn_left_1.png \
            file://Images/Turn_right_0.png \
            file://Images/Turn_right_1.png \
            file://Images/0.png \
            file://Images/10.png \
            file://Images/11.png \
            file://Images/12.png \
            file://Images/13.png \
            file://Images/14.png \
            file://Images/15.png \
            file://Images/16.png \
            file://Images/17.png \
            file://Images/18.png \
            file://Images/19.png \
            file://Images/1.png \
            file://Images/20.png \
            file://Images/21.png \
            file://Images/22.png \
            file://Images/23.png \
            file://Images/24.png \
            file://Images/25.png \
            file://Images/26.png \
            file://Images/27.png \
            file://Images/28.png \
            file://Images/29.png \
            file://Images/2.png \
            file://Images/30.png \
            file://Images/31.png \
            file://Images/32.png \
            file://Images/33.png \
            file://Images/34.png \
            file://Images/35.png \
            file://Images/36.png \
            file://Images/37.png \
            file://Images/38.png \
            file://Images/39.png \
            file://Images/3.png \
            file://Images/40.png \
            file://Images/41.png \
            file://Images/42.png \
            file://Images/43.png \
            file://Images/44.png \
            file://Images/45.png \
            file://Images/46.png \
            file://Images/47.png \
            file://Images/48.png \
            file://Images/49.png \
            file://Images/4.png \
            file://Images/50.png \
            file://Images/51.png \
            file://Images/52.png \
            file://Images/53.png \
            file://Images/54.png \
            file://Images/55.png \
            file://Images/56.png \
            file://Images/57.png \
            file://Images/58.png \
            file://Images/59.png \
            file://Images/5.png \
            file://Images/60.png \
            file://Images/6.png \
            file://Images/7.png \
            file://Images/8.png \
            file://Images/9.png \
            file://Images/Background.png \
"

S = "${WORKDIR}"

do_install(){
    install -d ${D}/home/root
    install -m 0770 Images/Background.png ${D}${sbindir}/Images
    install -m 0770 Images/EVER.png ${D}${sbindir}/Images
    install -m 0770 Images/High_light.png ${D}${sbindir}/Images
    install -m 0770 Images/Horn.png ${D}${sbindir}/Images
    install -m 0770 Images/Neutrino_logo.png ${D}${sbindir}/Images
    install -m 0770 Images/Park.png ${D}${sbindir}/Images
    install -m 0770 Images/Runing_light.png ${D}${sbindir}/Images
    install -m 0770 Images/Turn_left_0.png ${D}${sbindir}/Images
    install -m 0770 Images/Turn_left_1.png ${D}${sbindir}/Images
    install -m 0770 Images/Turn_right_0.png ${D}${sbindir}/Images
    install -m 0770 Images/Turn_right_1.png ${D}${sbindir}/Images
    install -m 0770 Images/0.png ${D}${sbindir}/Images
    install -m 0770 Images/10.png ${D}${sbindir}/Images
    install -m 0770 Images/11.png ${D}${sbindir}/Images
    install -m 0770 Images/12.png ${D}${sbindir}/Images
    install -m 0770 Images/13.png ${D}${sbindir}/Images
    install -m 0770 Images/14.png ${D}${sbindir}/Images
    install -m 0770 Images/15.png ${D}${sbindir}/Images
    install -m 0770 Images/16.png ${D}${sbindir}/Images
    install -m 0770 Images/17.png ${D}${sbindir}/Images
    install -m 0770 Images/18.png ${D}${sbindir}/Images
    install -m 0770 Images/19.png ${D}${sbindir}/Images
    install -m 0770 Images/1.png ${D}${sbindir}/Images
    install -m 0770 Images/20.png ${D}${sbindir}/Images
    install -m 0770 Images/21.png ${D}${sbindir}/Images
    install -m 0770 Images/22.png ${D}${sbindir}/Images
    install -m 0770 Images/23.png ${D}${sbindir}/Images
    install -m 0770 Images/24.png ${D}${sbindir}/Images
    install -m 0770 Images/25.png ${D}${sbindir}/Images
    install -m 0770 Images/26.png ${D}${sbindir}/Images
    install -m 0770 Images/27.png ${D}${sbindir}/Images
    install -m 0770 Images/28.png ${D}${sbindir}/Images
    install -m 0770 Images/29.png ${D}${sbindir}/Images
    install -m 0770 Images/2.png ${D}${sbindir}/Images
    install -m 0770 Images/30.png ${D}${sbindir}/Images
    install -m 0770 Images/31.png ${D}${sbindir}/Images
    install -m 0770 Images/32.png ${D}${sbindir}/Images
    install -m 0770 Images/33.png ${D}${sbindir}/Images
    install -m 0770 Images/34.png ${D}${sbindir}/Images
    install -m 0770 Images/35.png ${D}${sbindir}/Images
    install -m 0770 Images/36.png ${D}${sbindir}/Images
    install -m 0770 Images/37.png ${D}${sbindir}/Images
    install -m 0770 Images/38.png ${D}${sbindir}/Images
    install -m 0770 Images/39.png ${D}${sbindir}/Images
    install -m 0770 Images/3.png ${D}${sbindir}/Images
    install -m 0770 Images/40.png ${D}${sbindir}/Images
    install -m 0770 Images/41.png ${D}${sbindir}/Images
    install -m 0770 Images/42.png ${D}${sbindir}/Images
    install -m 0770 Images/43.png ${D}${sbindir}/Images
    install -m 0770 Images/44.png ${D}${sbindir}/Images
    install -m 0770 Images/45.png ${D}${sbindir}/Images
    install -m 0770 Images/46.png ${D}${sbindir}/Images
    install -m 0770 Images/47.png ${D}${sbindir}/Images
    install -m 0770 Images/48.png ${D}${sbindir}/Images
    install -m 0770 Images/49.png ${D}${sbindir}/Images
    install -m 0770 Images/4.png ${D}${sbindir}/Images
    install -m 0770 Images/50.png ${D}${sbindir}/Images
    install -m 0770 Images/51.png ${D}${sbindir}/Images
    install -m 0770 Images/52.png ${D}${sbindir}/Images
    install -m 0770 Images/53.png ${D}${sbindir}/Images
    install -m 0770 Images/54.png ${D}${sbindir}/Images
    install -m 0770 Images/55.png ${D}${sbindir}/Images
    install -m 0770 Images/56.png ${D}${sbindir}/Images
    install -m 0770 Images/57.png ${D}${sbindir}/Images
    install -m 0770 Images/58.png ${D}${sbindir}/Images
    install -m 0770 Images/59.png ${D}${sbindir}/Images
    install -m 0770 Images/5.png ${D}${sbindir}/Images
    install -m 0770 Images/60.png ${D}${sbindir}/Images
    install -m 0770 Images/6.png ${D}${sbindir}/Images
    install -m 0770 Images/7.png ${D}${sbindir}/Images
    install -m 0770 Images/8.png ${D}${sbindir}/Images
    install -m 0770 Images/9.png ${D}${sbindir}/Images
}

FILES_${PN} += " \
${D}${sbindir}/Images/Background.png \
${D}${sbindir}/Images/EVER.png \
${D}${sbindir}/Images/High_light.png \
${D}${sbindir}/Images/Horn.png \
${D}${sbindir}/Images/Neutrino_logo.png \
${D}${sbindir}/Images/Park.png \
${D}${sbindir}/Images/Runing_light.png \
${D}${sbindir}/Images/Turn_left_0.png \
${D}${sbindir}/Images/Turn_left_1.png \
${D}${sbindir}/Images/Turn_right_0.png \
${D}${sbindir}/Images/Turn_right_1.png \
${D}${sbindir}/Images/0.png \
${D}${sbindir}/Images/10.png \
${D}${sbindir}/Images/11.png \
${D}${sbindir}/Images/12.png \
${D}${sbindir}/Images/13.png \
${D}${sbindir}/Images/14.png \
${D}${sbindir}/Images/15.png \
${D}${sbindir}/Images/16.png \
${D}${sbindir}/Images/17.png \
${D}${sbindir}/Images/18.png \
${D}${sbindir}/Images/19.png \
${D}${sbindir}/Images/1.png \
${D}${sbindir}/Images/20.png \
${D}${sbindir}/Images/21.png \
${D}${sbindir}/Images/22.png \
${D}${sbindir}/Images/23.png \
${D}${sbindir}/Images/24.png \
${D}${sbindir}/Images/25.png \
${D}${sbindir}/Images/26.png \
${D}${sbindir}/Images/27.png \
${D}${sbindir}/Images/28.png \
${D}${sbindir}/Images/29.png \
${D}${sbindir}/Images/2.png \
${D}${sbindir}/Images/30.png \
${D}${sbindir}/Images/31.png \
${D}${sbindir}/Images/32.png \
${D}${sbindir}/Images/33.png \
${D}${sbindir}/Images/34.png \
${D}${sbindir}/Images/35.png \
${D}${sbindir}/Images/36.png \
${D}${sbindir}/Images/37.png \
${D}${sbindir}/Images/38.png \
${D}${sbindir}/Images/39.png \
${D}${sbindir}/Images/3.png \
${D}${sbindir}/Images/40.png \
${D}${sbindir}/Images/41.png \
${D}${sbindir}/Images/42.png \
${D}${sbindir}/Images/43.png \
${D}${sbindir}/Images/44.png \
${D}${sbindir}/Images/45.png \
${D}${sbindir}/Images/46.png \
${D}${sbindir}/Images/47.png \
${D}${sbindir}/Images/48.png \
${D}${sbindir}/Images/49.png \
${D}${sbindir}/Images/4.png \
${D}${sbindir}/Images/50.png \
${D}${sbindir}/Images/51.png \
${D}${sbindir}/Images/52.png \
${D}${sbindir}/Images/53.png \
${D}${sbindir}/Images/54.png \
${D}${sbindir}/Images/55.png \
${D}${sbindir}/Images/56.png \
${D}${sbindir}/Images/57.png \
${D}${sbindir}/Images/58.png \
${D}${sbindir}/Images/59.png \
${D}${sbindir}/Images/5.png \
${D}${sbindir}/Images/60.png \
${D}${sbindir}/Images/6.png \
${D}${sbindir}/Images/7.png \
${D}${sbindir}/Images/8.png \
${D}${sbindir}/Images/9.png \
"


