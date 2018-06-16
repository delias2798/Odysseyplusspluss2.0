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
    void diccionary(string dic);
    QString decode(QString huff);

private:
    QMap<QString,QString> map;
};

#endif // HUFFMAN_H
