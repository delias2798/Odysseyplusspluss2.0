#include "odyssey_s.h"
#include "ody_calls.h"
#include <QApplication>
#include <iostream>
#include <QDebug>
#include"huffman.h"
int main(int argc, char *argv[])
{
    QApplication a(argc, argv);

    Odyssey_S w;
    w.show();
    /*xmlConvert xml = xmlConvert();
    calls *sql = new calls();
    ody_calls *call = new ody_calls();*/
    /*QString xml_2 = "<user><username>edd</username><age>22</age><friends>OTOR Test fhjghjdk</friends>"
                    "<lastname>Solano</lastname><like>1 2 3 4 5 6</like><name>Eduardo</name><pass>123456</pass></user>";

    QString xml_3 = "<user>    <pass>wrwffffffffffffffffffffffffffffffffffffffd</pass>  \n\n  <tag>GoLogin</tag>   \n <username>hgfffffffffffffffffffffffffffffffffffffffffddf</username></user>";

    std::cout<<xml_3.toStdString()<<std::endl;
    qDebug()<<xml_3;*/
    //qDebug()<<call->login("edd","123456");//call->login(xml_3);//call->needAllTrack();//call->needTrack("OTOR","Hey jude");*/

   /* QString compres="1011011100";
    QString diccionary="";
    QString text="";
    QMap<QString,QString> map;

    QString add="";
    std::string code="//j10//o110//s111//e0";
    int x;
    std::string dic="";
    std::string find="//";
    size_t found;
    while(code!=""){
        x=code.size();
        found=code.find(find)+1;
        dic=code.substr(0,found-1);
        code=code.substr(found+1,x);
        /////////////////////////////////
        //separa los elementos x espacios
        //std::cout<< dic <<std::endl;
        add=QString::fromStdString(dic);
        map.insert(add.mid(1,add.length()),add.mid(0,1));
        //qDebug()<<add;
        if(found==0)
            code="";
    }

    qDebug()<<map.value("33");



    //QString text="";
    QString compare="";
    while (compres>1) {
        compare=compare+compres.mid(0,1);
        compres=compres.mid(1,compres.length());
        if(map.value(compare)!=""){
            text=text+map.value(compare);
            compare="";
        }
    }





    qDebug()<<text<<"  Primer print";
    /*if(map.value("0")!="")
        qDebug()<<map.value("e");

    std::cout<< map.value("0").toStdString() <<std::endl;*/
    return a.exec();
}
