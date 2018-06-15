#include "odyssey_s.h"
#include "ody_calls.h"
#include <QApplication>
#include <iostream>
#include <QDebug>
int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    Odyssey_S w;
    w.show();
    /*xmlConvert xml = xmlConvert();
    calls *sql = new calls();
    ody_calls *call = new ody_calls();
    /*QString xml_2 = "<user><username>edd</username><age>22</age><friends>OTOR Test fhjghjdk</friends>"
                    "<lastname>Solano</lastname><like>1 2 3 4 5 6</like><name>Eduardo</name><pass>123456</pass></user>";

    QString xml_3 = "<user>    <pass>wrwffffffffffffffffffffffffffffffffffffffd</pass>  \n\n  <tag>GoLogin</tag>   \n <username>hgfffffffffffffffffffffffffffffffffffffffffddf</username></user>";

    std::cout<<xml_3.toStdString()<<std::endl;
    qDebug()<<xml_3;*/
    //qDebug()<<call->login("edd","123456");//call->login(xml_3);//call->needAllTrack();//call->needTrack("OTOR","Hey jude");*/
    return a.exec();
}
