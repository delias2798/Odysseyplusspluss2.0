#ifndef HUFFMAN_H
#define HUFFMAN_H
#include<QString>
#include <QMap>
#include<QDebug>
#include<iostream>
using namespace std;
class huffman
{
public:
    huffman();
    /**
     * @brief diccionary    construye el disccionario dado
     * @param dic
     */
    void diccionary(string dic);

    /**
     * @brief decode    reconstruye el string original con el diccionario
     * @param huff
     * @return
     */
    QString decode(QString huff);

private:
    QMap<QString,QString> map;
};

#endif // HUFFMAN_H
