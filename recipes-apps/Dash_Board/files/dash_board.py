# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'dash_board.ui'
#
# Created by: PyQt5 UI code generator 5.15.4
#
# WARNING: Any manual changes made to this file will be lost when pyuic5 is
# run again.  Do not edit this file unless you know what you are doing.

from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtCore import QObject, QTimer
from datetime import datetime
import socket

path = "/home/images"
driver_file_path = "/dev/car_ecu_buttons"

park_bit = 0
horn_bit = 1
running_light = 2
high_light_bit = 3
Right_sign_bit = 4
Left_sign_bit = 5

def read_labels():
    global driver_file_path
    labels_value = open(driver_file_path,'r')
    value = labels_value.read(6)
    labels_value.close()
    return value 

class Ui_MainWindow(QObject,object):
    def __init__(self,MainWindow) :
        super().__init__()
        self.centralwidget = QtWidgets.QWidget(MainWindow)
        self.Right_sign = QtWidgets.QLabel(self.centralwidget)
        self.Left_sign = QtWidgets.QLabel(self.centralwidget)
        self.Ever = QtWidgets.QLabel(self.centralwidget)
        self.neutrino = QtWidgets.QLabel(self.centralwidget)
        self.KM = QtWidgets.QLCDNumber(self.centralwidget)
        self.RPM = QtWidgets.QLCDNumber(self.centralwidget)
        self.high_light = QtWidgets.QLabel(self.centralwidget)
        self.running_light = QtWidgets.QLabel(self.centralwidget)
        self.horn = QtWidgets.QLabel(self.centralwidget)
        self.park = QtWidgets.QLabel(self.centralwidget)
        self.speed = QtWidgets.QLabel(self.centralwidget)

        self.current_KM = 0
        self.start_hour = int(datetime.now().strftime("%H"))
        self.start_time = int(datetime.now().strftime("%M"))

        self.timer = QTimer()
        self.timer.setInterval(200)
        self.timer.timeout.connect(self.main_task)
        self.timer.start()
        
    def setupUi(self, MainWindow):
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(800, 480)

        self.centralwidget.setObjectName("centralwidget")

        self.Left_sign.setGeometry(QtCore.QRect(0, 50, 150, 100))
        self.Left_sign.setText("")
        self.Left_sign.setPixmap(QtGui.QPixmap(f"{path}/Turn_left_0.png"))
        self.Left_sign.setScaledContents(True)
        self.Left_sign.setObjectName("Left_sign")

        self.Right_sign.setGeometry(QtCore.QRect(650, 50, 150, 100))
        self.Right_sign.setAutoFillBackground(False)
        self.Right_sign.setText("")
        self.Right_sign.setPixmap(QtGui.QPixmap(f"{path}/Turn_right_0.png"))
        self.Right_sign.setScaledContents(True)
        self.Right_sign.setObjectName("Right_sign")

        self.Ever.setGeometry(QtCore.QRect(0, 330, 150, 100))
        self.Ever.setText("")
        self.Ever.setPixmap(QtGui.QPixmap(f"{path}/EVER.png"))
        self.Ever.setScaledContents(True)
        self.Ever.setObjectName("Ever")

        self.neutrino.setGeometry(QtCore.QRect(650, 330, 150, 100))
        self.neutrino.setText("")
        self.neutrino.setPixmap(QtGui.QPixmap(f"{path}/Neutrino_logo.png"))
        self.neutrino.setScaledContents(True)
        self.neutrino.setObjectName("neutrino")

        self.KM.setGeometry(QtCore.QRect(320, 30, 81, 51))
        self.KM.setLayoutDirection(QtCore.Qt.LeftToRight)
        self.KM.setAutoFillBackground(True)
        self.KM.setDigitCount(3)
        self.KM.setProperty("value", 0.0)
        self.KM.setObjectName("KM")

        self.RPM.setGeometry(QtCore.QRect(320, 360, 101, 51))
        self.RPM.setAutoFillBackground(True)
        self.RPM.setDigitCount(3)
        self.RPM.setProperty("value", 0.0)
        self.RPM.setObjectName("RPM")

        self.high_light.setGeometry(QtCore.QRect(100, 150, 81, 70))
        self.high_light.setText("")
        self.high_light.setPixmap(QtGui.QPixmap(f"{path}/High_light.png"))
        self.high_light.setScaledContents(True)
        self.high_light.setObjectName("high_light")
        self.high_light.setHidden(True)

        self.running_light.setGeometry(QtCore.QRect(590, 150, 81, 70))
        self.running_light.setText("")
        self.running_light.setPixmap(QtGui.QPixmap(f"{path}/Runing_light.png"))
        self.running_light.setScaledContents(True)
        self.running_light.setObjectName("running_light")
        self.running_light.setHidden(True)

        self.horn.setGeometry(QtCore.QRect(90, 230, 81, 70))
        self.horn.setText("")
        self.horn.setPixmap(QtGui.QPixmap(f"{path}/Horn.png"))
        self.horn.setScaledContents(True)
        self.horn.setObjectName("horn")
        self.horn.setHidden(True)

        self.park.setGeometry(QtCore.QRect(710, 190, 81, 70))
        self.park.setAutoFillBackground(False)
        self.park.setText("")
        self.park.setPixmap(QtGui.QPixmap(f"{path}/Park.png"))
        self.park.setScaledContents(True)
        self.park.setObjectName("park")
        self.park.setHidden(True)

        self.label_5 = QtWidgets.QLabel(self.centralwidget)
        self.label_5.setGeometry(QtCore.QRect(0, 0, 800, 480))
        font = QtGui.QFont()
        font.setPointSize(30)
        self.label_5.setFont(font)
        self.label_5.setAutoFillBackground(False)
        self.label_5.setText("")
        self.label_5.setPixmap(QtGui.QPixmap(f"{path}/Background.png"))
        self.label_5.setObjectName("label_5")
        self.label_6 = QtWidgets.QLabel(self.centralwidget)
        self.label_6.setGeometry(QtCore.QRect(410, 50, 67, 17))
        self.label_6.setObjectName("label_6")
        self.label_7 = QtWidgets.QLabel(self.centralwidget)
        self.label_7.setGeometry(QtCore.QRect(400, 30, 51, 51))
        font = QtGui.QFont()
        font.setPointSize(20)
        self.label_7.setFont(font)
        self.label_7.setAutoFillBackground(True)
        self.label_7.setObjectName("label_7")
        self.label_8 = QtWidgets.QLabel(self.centralwidget)
        self.label_8.setGeometry(QtCore.QRect(420, 360, 61, 51))
        font = QtGui.QFont()
        font.setPointSize(20)
        self.label_8.setFont(font)
        self.label_8.setAutoFillBackground(True)
        self.label_8.setObjectName("label_8")

        self.speed.setGeometry(QtCore.QRect(206, 100, 351, 231))
        self.speed.setText("")
        self.speed.setPixmap(QtGui.QPixmap(f"{path}/0.png"))
        self.speed.setScaledContents(True)
        self.speed.setObjectName("speed")

        self.label_5.raise_()
        self.running_light.raise_()
        self.Left_sign.raise_()
        self.Right_sign.raise_()
        self.Ever.raise_()
        self.neutrino.raise_()
        self.KM.raise_()
        self.RPM.raise_()
        self.high_light.raise_()
        self.horn.raise_()
        self.park.raise_()
        self.label_6.raise_()
        self.label_7.raise_()
        self.label_8.raise_()
        self.speed.raise_()
        MainWindow.setCentralWidget(self.centralwidget)
        self.menubar = QtWidgets.QMenuBar(MainWindow)
        self.menubar.setGeometry(QtCore.QRect(0, 0, 800, 22))
        self.menubar.setObjectName("menubar")
        MainWindow.setMenuBar(self.menubar)
        self.statusbar = QtWidgets.QStatusBar(MainWindow)
        self.statusbar.setObjectName("statusbar")
        MainWindow.setStatusBar(self.statusbar)

        self.retranslateUi(MainWindow)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)

    def retranslateUi(self, MainWindow):
        _translate = QtCore.QCoreApplication.translate
        MainWindow.setWindowTitle(_translate("MainWindow", "MainWindow"))
        self.label_6.setText(_translate("MainWindow", "TextLabel"))
        self.label_7.setText(_translate("MainWindow", "Km"))
        self.label_8.setText(_translate("MainWindow", "RPM"))

    def set_right_sign_state(self,state):
        self.Right_sign.setPixmap(QtGui.QPixmap(f"{path}/Turn_right_{state}.png"))

    def set_left_sign_state(self,state):
        self.Left_sign.setPixmap(QtGui.QPixmap(f"{path}/Turn_left_{state}.png"))

    def set_lable_park(self,state):
        self.park.setHidden(state)

    def set_lable_horn(self,state):
        self.horn.setHidden(state)

    def set_lable_running_light(self,state):
        self.running_light.setHidden(state)

    def set_lable_high_light(self,state):
        self.high_light.setHidden(state)

    def set_KM(self,Km_value):
        self.KM.setProperty("value", Km_value)

    def set_RPM(self,RPM_value):
        self.RPM.setProperty("value", RPM_value)

    def Set_speed(self,speed):
        self.speed.setPixmap(QtGui.QPixmap(f"{path}/{speed}.png"))

    def main_task(self):
        bufferSize = 6
        ServerPort = 2222
        ServerIP = '192.168.1.12'

        current_hour = int(datetime.now().strftime("%H"))
        labels_data = read_labels()
        bytesTosend = labels_data.encode('utf-8')
        RPISocket = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
        RPISocket.bind((ServerIP,ServerPort))
        speed_data,address = RPISocket.recvfrom(bufferSize) 
        speed_data = speed_data.decode('utf-8')
        RPISocket.sendto(bytesTosend,address)

        self.set_right_sign_state(labels_data[Right_sign_bit])
        self.set_left_sign_state(labels_data[Left_sign_bit])

        self.set_lable_park(not(int(labels_data[park_bit])))
        self.set_lable_horn(not(int(labels_data[horn_bit])))
        self.set_lable_running_light(not(int(labels_data[running_light])))
        self.set_lable_high_light(not(int(labels_data[high_light_bit])))

        self.Set_speed(speed_data)
        current_time = int(datetime.now().strftime("%M")) +(60*(current_hour-self.start_hour))
        Elapsed_time = current_time - self.start_time
        self.current_KM += ((speed_data*Elapsed_time)/60)
        self.set_KM(self.current_KM)

if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    MainWindow = QtWidgets.QMainWindow()
    ui = Ui_MainWindow(MainWindow)
    ui.setupUi(MainWindow)
    MainWindow.show()
    sys.exit(app.exec_())

