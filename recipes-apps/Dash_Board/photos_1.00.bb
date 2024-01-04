
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
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/EVER.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/High_light.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Horn.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Neutrino_logo.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Park.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Runing_light.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_left_0.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_left_1.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_right_0.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_right_1.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/0.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/10.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/11.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/12.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/13.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/14.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/15.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/16.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/17.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/18.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/19.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/1.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/20.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/21.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/22.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/23.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/24.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/25.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/26.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/27.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/28.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/29.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/2.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/30.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/31.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/32.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/33.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/34.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/35.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/36.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/37.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/38.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/39.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/3.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/40.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/41.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/42.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/43.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/44.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/45.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/46.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/47.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/48.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/49.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/4.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/50.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/51.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/52.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/53.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/54.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/55.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/56.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/57.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/58.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/59.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/5.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/60.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/6.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/7.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/8.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/9.png \
            file:///home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Background.png \
"

S = "${WORKDIR}"

do_install(){
    install -d ${D}/home/root
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Background.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/EVER.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/High_light.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Horn.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Neutrino_logo.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Park.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Runing_light.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_left_0.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_left_1.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_right_0.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/labels/Turn_right_1.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/0.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/10.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/11.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/12.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/13.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/14.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/15.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/16.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/17.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/18.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/19.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/1.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/20.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/21.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/22.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/23.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/24.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/25.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/26.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/27.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/28.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/29.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/2.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/30.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/31.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/32.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/33.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/34.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/35.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/36.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/37.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/38.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/39.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/3.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/40.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/41.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/42.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/43.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/44.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/45.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/46.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/47.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/48.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/49.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/4.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/50.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/51.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/52.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/53.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/54.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/55.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/56.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/57.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/58.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/59.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/5.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/60.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/6.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/7.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/8.png ${D}/home/root/
    install -m 0770 /home/soliman/Embedded_Linux/yocto_project/projects/meta-Dashboard/recipes-apps/Dash_Board/files/speedometer/9.png ${D}/home/root/
}

FILES_${PN} += " \
/home/root/Background.png \
home/root/EVER.png \
home/root/High_light.png \
home/root/Horn.png \
home/root/Neutrino_logo.png \
home/root/Park.png \
home/root/Runing_light.png \
home/root/Turn_left_0.png \
home/root/Turn_left_1.png \
home/root/Turn_right_0.png \
home/root/Turn_right_1.png \
home/root/0.png \
home/root/10.png \
home/root/11.png \
home/root/12.png \
home/root/13.png \
home/root/14.png \
home/root/15.png \
home/root/16.png \
home/root/17.png \
home/root/18.png \
home/root/19.png \
home/root/1.png \
home/root/20.png \
home/root/21.png \
home/root/22.png \
home/root/23.png \
home/root/24.png \
home/root/25.png \
home/root/26.png \
home/root/27.png \
home/root/28.png \
home/root/29.png \
home/root/2.png \
home/root/30.png \
home/root/31.png \
home/root/32.png \
home/root/33.png \
home/root/34.png \
home/root/35.png \
home/root/36.png \
home/root/37.png \
home/root/38.png \
home/root/39.png \
home/root/3.png \
home/root/40.png \
home/root/41.png \
home/root/42.png \
home/root/43.png \
home/root/44.png \
home/root/45.png \
home/root/46.png \
home/root/47.png \
home/root/48.png \
home/root/49.png \
home/root/4.png \
home/root/50.png \
home/root/51.png \
home/root/52.png \
home/root/53.png \
home/root/54.png \
home/root/55.png \
home/root/56.png \
home/root/57.png \
home/root/58.png \
home/root/59.png \
home/root/5.png \
home/root/60.png \
home/root/6.png \
home/root/7.png \
home/root/8.png \
home/root/9.png \
"


