#include "odyssey_s.h"
#include "ui_odyssey_s.h"

#include <QNetworkInterface>
#include <QtCore>
#include <QtXml>
#include <QDebug>
#include <QCoreApplication>

#include <QJsonObject>
#include <QJsonDocument>
#include <string.h>
#include <iostream>
#include <fstream>



QString xml;
QString xml2;
QString folder1 = "/home/toshiba/Escritorio/Ody/FolderOdyssey";
QString folder2 =  "/home/toshiba/Escritorio/Ody/FolderOdyssey/AudioFile";
std::string user = "/home/toshiba/Escritorio/Ody/FolderOdyssey/Users.json";

std::ofstream ficheroSalida;

int j=0;
Odyssey_S::Odyssey_S(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::Odyssey_S)
{

    createFile();
    ui->setupUi(this);
    tcpservidor = new QTcpServer(this);
    tcpservidor->setMaxPendingConnections(3);

    streaming = new QTcpServer(this);
    streaming->setMaxPendingConnections(3);


    for(int i = 0; i< tcpservidor->maxPendingConnections();i++){
        tcpcliente[i] = new QTcpSocket(this);
    }


    for(int i = 0; i< streaming->maxPendingConnections();i++){
        tcpclienteStreaming[i] = new QTcpSocket(this);
    }


    QHostAddress hostadd("192.168.1.147");//"192.168.43.223");

    tcpservidor->listen(hostadd,8888);
    connect(tcpservidor,SIGNAL(newConnection()),this, SLOT(conexion_nueva()));


    streaming->listen(hostadd,8080);
    connect(streaming,SIGNAL(newConnection()),this, SLOT(conexion_Streaming()));

}

/**
 * @brief Método para borrar la llamada de la creación de la ventana
 *
 */
Odyssey_S::~Odyssey_S()
{
    delete ui;
}


void Odyssey_S::createFile(){
   if (QDir(folder1).exists() == false){
       QDir().mkdir(folder1);
       std::ofstream userFile(user);
       userFile.close();

       qDebug()<<"FolderOdyssey created with Users.json";

       if (QDir(folder2).exists() == false){
           QDir().mkdir(folder2);
           std::string metadata = folder2.append("/Metadata.json").toStdString();
           std::ofstream metadataFile(metadata);
           metadataFile.close();
           qDebug()<<"AudioFile created with Metadata.json";
       }
   }
}

std::__cxx11::string Odyssey_S::removebackn(std::__cxx11::string code)
{
    int x;
    std::string code_end="";
    std::string find="\n";
    size_t found;
    while(code!=""){
        x=code.size();
        found=code.find(find)+1;
        code_end=code_end+code.substr(0,found-1);
        code=code.substr(found,x);
        if(found==0)
            code="";
    }
    return code_end;
}

/**
 * @brief Método para crear una nueva conexión
 *
 */
void Odyssey_S::conexion_nueva(){

    tcpcliente[0] = tcpservidor->nextPendingConnection();
    connect(tcpcliente[0],SIGNAL(readyRead()),this, SLOT(leer_socket()));
    ui->label_Custumer->setText("Connected");

}

/**
 * @brief Método para realizar streaming
 *
 */
void Odyssey_S::conexion_Streaming(){

    tcpclienteStreaming[0] = streaming->nextPendingConnection();
    connect(tcpclienteStreaming[0],SIGNAL(readyRead()),this, SLOT(leer_Streaming()));
    ui->label_Custumer->setText("Streaming...");

}



/**
 * @brief Método hacer la comunicación del socket Login_Server
 *
 */
void Odyssey_S::leer_socket() {       //Recibe los datos del cliente
    if(tcpcliente[0]->bytesAvailable() > 0){
        qDebug() << "Socket ";
        QByteArray buffer;

        buffer.resize( tcpcliente[0]->bytesAvailable());
        tcpcliente[0]->read( buffer.data(),buffer.size() );

        //qDebug() <<"Buff  " <<buffer;

        if(QString (buffer)!="\n"){ //Condición para no pasar "basura" del socket
            ui->plainTextEdit->setReadOnly(true);
            ui->plainTextEdit->appendPlainText("Login :"+ QString(buffer));//Aqui esta a lectura de lo recivido "Buffer"
        xml = QString (buffer)+"\n";


        std::string texto=removebackn(xml.toStdString());
        //std::cout<<texto<<std::endl;
        //QString answer = QString(texto);
        //qDebug()<<texto;

        QString uSerLogin,fuSerLogin= "";

        QString input(buffer);//Aqui esta a lectura de lo recivido "Buffer"

        QString xml_ = QString::fromStdString(texto);

        string y=call->answer(xml).toUtf8().constData();
        string res=removebackn(y);

        QString x=QString::fromStdString(res)+"\n";
        tcpcliente[0]->write( x.toLatin1().data(), x.toLatin1().size());//dato y tamaño
        //envio de datos al cliente
        }
    }
    else{
        ui->plainTextEdit->appendPlainText("No se puedo realizar la comunicacion <socket Login>");
    }

    //QString toclient  = "<client><username>"+uSerLogin+"</username><password>"+fuSerLogin+"</password><acces>"+acces+"</acces></client>";

}

    /**
     * @brief M
étodo hacer la comunicación del socket Login_Server
     *
     */
    void Odyssey_S::leer_Streaming() {       //Recibe los datos del cliente
        if(tcpclienteStreaming[0]->bytesAvailable() > 0){

            qDebug() << "Socket Streaming ";
            QByteArray buffer;
            buffer.resize( tcpclienteStreaming[0]->bytesAvailable());
            tcpclienteStreaming[0]->read( buffer.data(),buffer.size() );

            QByteArray utf16 = buffer;
            QString str = QString::fromUtf16(
                            reinterpret_cast<const ushort*>(utf16.constData()));






            qDebug()<<str;
            /*xml = QString (buffer)+"\n";

            QString input(buffer);

            qDebug()<<xml;


            /*QByteArray *data = new QByteArray();
            while(1){
                if(tcpclienteStreaming[0]->waitForReadyRead(30000)){
                    data->append(tcpclienteStreaming[0]->readAll());
                    qDebug()<<*data;
                }
                else
                    break;
            }
            QBuffer *buffer = new QBuffer(data);
            QEventLoop *loop = new QEventLoop(this);
            buffer->open(QIODevice::ReadOnly);



            loop->exec();*/

        }
    }


            /*

            if(QString (buffer)!="\n"){ //Condición para no pasar "basura" del socket
                ui->plainTextEdit->setReadOnly(true);
                ui->plainTextEdit->appendPlainText("Login :"+ QString(buffer));//Aqui esta a lectura de lo recivido "Buffer"
            xml = QString (buffer)+"\n";

            std::string texto=removebackn(xml.toStdString());
            //std::cout<<texto<<std::endl;
            //QString answer = QString(texto);
            //qDebug()<<texto;

            QString uSerLogin,fuSerLogin= "";

            QString input(buffer);//Aqui esta a lectura de lo recivido "Buffer"

            QString xml_ = QString::fromStdString(texto);

            string y=call->answer(xml).toUtf8().constData();
            string res=removebackn(y);

            QString x=QString::fromStdString(res)+"\n";
            tcpcliente[0]->write( x.toLatin1().data(), x.toLatin1().size());//dato y tamaño
            //envio de datos al cliente



            }
        }
        else{
            ui->plainTextEdit->appendPlainText("No se puedo realizar la comunicacion <socket Login>");
        }

        */
