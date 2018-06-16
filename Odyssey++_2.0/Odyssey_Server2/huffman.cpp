#include "huffman.h"

huffman::huffman()
{

}

void huffman::diccionary(string code)
{
    QString add="";
    int x;
    string dic="";
    string find="//";
    size_t found;
    while(code!=""){
        x=code.size();
        found=code.find(find)+1;
        dic=code.substr(0,found-1);
        code=code.substr(found+1,x);
        /////////////////////////////////
        add=QString::fromStdString(dic);
        map.insert(add.mid(1,add.length()),add.mid(0,1));
        if(found==0)
            code="";
    }
}

QString huffman::decode(QString huff)
{
    QString compres=huff;
    QString text="";
    QString compare="";
    while (compres>1) {
        compare=compare+compres.mid(0,1);
        compres=compres.mid(1,compres.length());
        if(map.value(compare)!=""){
            text=text+map.value(compare);
            compare="";
        }
    }
    qDebug()<<text;
    return text;
}

