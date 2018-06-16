#include "huffman.h"

huffman::huffman()
{

}

/**
 * @brief huffman::diccionary se definio que un string sea un diccionario y que para identificar
 * sus separaciones se utitlizo un //
 * @param code
 */
void huffman::diccionary(string code)
{
    QString add="";
    int x;
    string dic="";
    string find="//";//elemento que se desea buscar
    size_t found;
    while(code!=""){
        x=code.size();
        found=code.find(find)+1;
        dic=code.substr(0,found-1);//x medios de operaciones se estrae el contenido entre los //
        code=code.substr(found+1,x);//se eliminan segmentos del codigo original
        /////////////////////////////////
        add=QString::fromStdString(dic);
        map.insert(add.mid(1,add.length()),add.mid(0,1));//construccion del mapeo para futuros uso
        if(found==0)
            code="";
    }
}

/**
 * @brief huffman::decode   su objetivo es convertir una cadena de 1 y 0 es un forma original
 * @param huff  cadena de 1 y 0
 * @return
 */
QString huffman::decode(QString huff)
{
    QString compres=huff;
    QString text="";
    QString compare="";
    while (compres.length()>1) {
        compare=compare+compres.mid(0,1);//encadela la busqueda de elementos
        compres=compres.mid(1,compres.length());//elimina el primer elemento de la cadena
        if(map.value(compare)!=""){//verifica que el lemento encontrado se encuentre en el diccionario
            text=text+map.value(compare);//extrae el contenido del diccionario
            compare="";
        }
    }
    qDebug()<<text;
    return text;
}

