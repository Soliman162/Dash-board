#include "mainwindow.h"
#include "./ui_mainwindow.h"

#define PARK_BIT            0
#define HORN_BIT            1
#define RUNNING_LIGHT_BIT   2
#define HIGH_LIGHT_BIT      3
#define RIGHT_SIGN_BIT      4
#define LEFT_SIGN_BIT       5

#define BUFFERSIZE       6
#define PORT_NUMBER      8080

#define WHEEL_RADUIS_mm     241UL
#define CALC_RPM(Speed)     int((Speed*1000000/60)/WHEEL_RADUIS_mm)

#define BUTTONS_ECU_DRIVER_FILE    QString::fromUtf8("/dev/car_ecu_buttons")


MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
    ,MainTask_timer(new QTimer())
    ,TCP_Server (new QTcpServer())
    ,ButtonsDeviceFile(BUTTONS_ECU_DRIVER_FILE)
    ,ConnectionSemaphore(1)
{

    ui->setupUi(this);
    ui->highlight->setVisible(false);
    ui->Horn->setVisible(false);
    ui->Runninglight->setVisible(false);
    ui->Park->setVisible(false);

    TCP_Server->setMaxPendingConnections(1);
    ConnectionSemaphore.acquire(1);
    if(TCP_Server->listen(QHostAddress::Any,PORT_NUMBER))
    {
        connect(TCP_Server,SIGNAL(newConnection()),this,SLOT(newConnection()));
    }

    MainTask_timer->setInterval(1000);
    connect(MainTask_timer, SIGNAL(timeout()), this, SLOT(Main_task()));
    MainTask_timer->start();
}

QByteArray MainWindow::ReadFile(void)
{
    static QByteArray line;
    if (ButtonsDeviceFile.open(QIODevice::ReadOnly | QIODevice::Text))
    {
        line = ButtonsDeviceFile.readLine();
        ButtonsDeviceFile.close();
    }
    return line;
}

void MainWindow::newConnection()
{
    Client_Socket = TCP_Server->nextPendingConnection();
    connect(Client_Socket,SIGNAL(readyRead()),this,SLOT(ReadData()));
    ConnectionSemaphore.release(1);
}

void MainWindow::ReadData()
{
    qint8 Speed_Value = 0;
    QByteArray Speed_Rec;
    Speed_Rec = Client_Socket->readAll();
    if( Speed_Rec.isEmpty() )
    {
        Speed_Value = 0;
    }
    else
    {
        Speed_Value = Speed_Rec.toInt();
    }
    Set_Speed(Speed_Value);
    Set_RPM(CALC_RPM(Speed_Value));
}
void MainWindow::Main_task()
{
    QByteArray Labels_Data = ReadFile();
    static QByteArray Last_Labels_Value = Labels_Data;
    if(!Labels_Data.isEmpty()
        && Last_Labels_Value != Labels_Data
        )
    {
        Set_High_Light_State(int(Labels_Data.at(HIGH_LIGHT_BIT)));
        Set_Running_Light_State(int(Labels_Data.at(RUNNING_LIGHT_BIT)));
        Set_Horn_State(int(Labels_Data.at(HORN_BIT)));
        Set_Park_State(int(Labels_Data.at(PARK_BIT)));
        Edit_Right_Direction(int(Labels_Data.at(RIGHT_SIGN_BIT)));
        Edit_Left_Direction(int(Labels_Data.at(LEFT_SIGN_BIT)));
        if(ConnectionSemaphore.tryAcquire(1,100))
        {
            Client_Socket->write(Labels_Data);
            ConnectionSemaphore.release(1);
        }
        Last_Labels_Value = Labels_Data;
    }
}
void MainWindow::Edit_Right_Direction(qint8 Right_State)
{
    Right_State -= '0';
    if(Right_State)
    {
       ui->Right_sign->setPixmap(QPixmap(QString::fromUtf8(":/Images/Images/Turn_right_1.png")));
    }
    else
    {
        ui->Right_sign->setPixmap(QPixmap(QString::fromUtf8(":/Images/Images/Turn_right_0.png")));
    }
}
void MainWindow::Edit_Left_Direction(qint8 Left_State)
{
    Left_State -= '0';
    if(Left_State)
    {
        ui->leftSign->setPixmap(QPixmap(QString::fromUtf8(":/Images/Images/Turn_left_1.png")));
    }
    else
    {
        ui->leftSign->setPixmap(QPixmap(QString::fromUtf8(":/Images/Images/Turn_left_0.png")));
    }
}

void MainWindow::Set_Speed(qint8 Speed_Value)
{
    QString Speed_v = QString::fromUtf8(":/Images/Images/%1.png").arg(QString::number(Speed_Value));
    ui->Speed->setPixmap(QPixmap(Speed_v));
}
void MainWindow::Set_Horn_State(qint8 State)
{
    State -= '0';
    ui->Horn->setVisible(State);
}
void MainWindow::Set_Park_State(qint8 State)
{
    State -= '0';
    ui->Park->setVisible(State);
}
void MainWindow::Set_Running_Light_State(qint8 State)
{
    State -= '0';
    ui->Runninglight->setVisible(State);
}
void MainWindow::Set_High_Light_State(qint8 State)
{
    State -= '0';
    ui->highlight->setVisible(State);
}

void MainWindow::Set_RPM(qint32 Value)
{
    QString RPM_String = QString::number(Value) + QString::fromUtf8(" RPM");
    ui->RPM->setMarkdown(RPM_String);

}

MainWindow::~MainWindow()
{
    delete MainTask_timer;
    delete TCP_Server;
    delete ui;
}
