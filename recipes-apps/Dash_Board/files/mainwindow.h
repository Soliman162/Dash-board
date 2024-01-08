#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QTimer>
#include <QTime>
#include <QString>
#include <QFile>
#include <QByteArray>
#include <QHostAddress>
#include <QIODevice>
#include <QTcpServer>
#include <QTcpSocket>
#include <QSemaphore>

QT_BEGIN_NAMESPACE
namespace Ui {
class MainWindow;
}
QT_END_NAMESPACE

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    MainWindow(QWidget *parent = nullptr);
    ~MainWindow();

private:
    Ui::MainWindow *ui;
    qint32 Start_hour;
    qint32 Start_minute;
    QTimer *MainTask_timer ;
    QFile ButtonsDeviceFile;
    QTcpServer *TCP_Server;
    QTcpSocket *Client_Socket;
    QSemaphore ConnectionSemaphore;

    void Edit_Right_Direction(qint8 Right_State);
    void Edit_Left_Direction(qint8 Left_State);
    QByteArray ReadFile(void);
    void Set_Speed(qint8 Speed_Value);
    void Set_Horn_State(qint8 state);
    void Set_Park_State(qint8 state);
    void Set_Running_Light_State(qint8 state);
    void Set_High_Light_State(qint8 State);
    void Set_RPM(qint32 Value);

private slots:
    void Main_task();
    void newConnection();
    void ReadData();

};
#endif // MAINWINDOW_H
