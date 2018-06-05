#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <stdio.h>
#include <string>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <QDebug>
#include <QHash>
#include <QtGui>

#define MAX_TREE_HT 100

QString resultado ="";
QString resultadoX ="";
QHash<QString, int> hash;

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow){
    ui->setupUi(this);
}

MainWindow::~MainWindow(){
    delete ui;
}

struct MinHeapNode {
    char data;
    unsigned freq;
    struct MinHeapNode *left, *right;
};

struct MinHeap {
    unsigned size;
    unsigned capacity;
    struct MinHeapNode** array;
};

struct MinHeapNode* newNode(char data, unsigned freq){
    struct MinHeapNode* temp = (struct MinHeapNode*)malloc(sizeof(struct MinHeapNode));

    temp->left = temp->right = NULL;
    temp->data = data;
    temp->freq = freq;

    return temp;
}

struct MinHeap* createMinHeap(unsigned capacity){
    struct MinHeap* minHeap = (struct MinHeap*)malloc(sizeof(struct MinHeap));
    minHeap->size = 0;
    minHeap->capacity = capacity;
    minHeap->array = (struct MinHeapNode**)malloc(minHeap->capacity * sizeof(struct MinHeapNode*));
    return minHeap;
}

void swapMinHeapNode(struct MinHeapNode** a, struct MinHeapNode** b){
    struct MinHeapNode* t = *a;
    *a = *b;
    *b = t;
}

void minHeapify(struct MinHeap* minHeap, int idx){
    int smallest = idx;
    int left = 2 * idx + 1;
    int right = 2 * idx + 2;

    if (left < minHeap->size && minHeap->array[left]->
            freq < minHeap->array[smallest]->freq)
        smallest = left;

    if (right < minHeap->size && minHeap->array[right]->
            freq < minHeap->array[smallest]->freq)
        smallest = right;

    if (smallest != idx) {
        swapMinHeapNode(&minHeap->array[smallest],
                        &minHeap->array[idx]);
        minHeapify(minHeap, smallest);
    }
}

int isSizeOne(struct MinHeap* minHeap){
    return (minHeap->size == 1);
}

struct MinHeapNode* extractMin(struct MinHeap* minHeap){
    struct MinHeapNode* temp = minHeap->array[0];
    minHeap->array[0] = minHeap->array[minHeap->size - 1];
    --minHeap->size;
    minHeapify(minHeap, 0);
    return temp;
}

void insertMinHeap(struct MinHeap* minHeap,struct MinHeapNode* minHeapNode){
    ++minHeap->size;
    int i = minHeap->size - 1;
    while (i && minHeapNode->freq < minHeap->array[(i - 1) / 2]->freq) {
        minHeap->array[i] = minHeap->array[(i - 1) / 2];
        i = (i - 1) / 2;
    }
    minHeap->array[i] = minHeapNode;
}

void buildMinHeap(struct MinHeap* minHeap){
    int n = minHeap->size - 1;
    int i;
    for (i = (n - 1) / 2; i >= 0; --i){
        minHeapify(minHeap, i);
    }
}

void printArr(int arr[], int n){
    int i;
    QString r ="";
    for (i = 0; i < n; ++i){
        r+=QString::number(arr[i]);
    }
    resultado+= " : "+r+"\n";
}

int isLeaf(struct MinHeapNode* root){
    return !(root->left) && !(root->right);
}

struct MinHeap* createAndBuildMinHeap(char data[], int freq[], int size)

{

    struct MinHeap* minHeap = createMinHeap(size);

    for (int i = 0; i < size; ++i)
        minHeap->array[i] = newNode(data[i], freq[i]);

    minHeap->size = size;
    buildMinHeap(minHeap);

    return minHeap;
}

struct MinHeapNode* buildHuffmanTree(char data[], int freq[], int size)

{
    struct MinHeapNode *left, *right, *top;
    struct MinHeap* minHeap = createAndBuildMinHeap(data, freq, size);

    while (!isSizeOne(minHeap)) {

        left = extractMin(minHeap);
        right = extractMin(minHeap);
        top = newNode('$', left->freq + right->freq);

        top->left = left;
        top->right = right;

        insertMinHeap(minHeap, top);
    }
    return extractMin(minHeap);
}

void printCodes(struct MinHeapNode* root, int arr[], int top){
    if (root->left) {
        arr[top] = 0;
        printCodes(root->left, arr, top + 1);
    }
    if (root->right) {
        arr[top] = 1;
        printCodes(root->right, arr, top + 1);
    }
    if (isLeaf(root)) {
        resultado+=root->data;
        printArr(arr, top);
    }
}

void HuffmanCodes(char data[], int freq[], int size){
    struct MinHeapNode* root = buildHuffmanTree(data, freq, size);
    int arr[MAX_TREE_HT], top = 0;
    printCodes(root, arr, top);
}



void MainWindow::on_pushButton_clicked(){
    char arr[] = { 'a', 'j', 'n', 's', 'v', 'm' };
    int freq[] = {2,5,9,433,501,521};          //Necesita que la frecuencia este ordena.
    int size = sizeof(arr) / sizeof(arr[0]);
    HuffmanCodes(arr, freq, size);
    ui->textEdit->append(resultado);

}

void MainWindow::on_SplitFrecuency_clicked()
{
    QString text = ui->lineEdit->text();
    std::string str = text.toStdString();
    QString cant = "";

    for (unsigned i=0; i <str.length() ; ++i)  {
        QString s = QString(str.at(i)); //letra

        //Condición de analisis numerico para determinar la cantidad de letras existen dentro del texto
        int cont1=0;
        for (int p=0; p<str.length();p++){
            if(QString(str[p]) == s ){
               cont1++;
            }
        }

        Dictionary(s,cont1);
    }

}



void MainWindow::on_createD_clicked()
{

    QHashIterator<QString, int> i(hash);

    char arr[256]={};
    int freq[256] ={} ;          //Necesita que la frecuencia este ordena.
    int auxCont = 0;

    while (i.hasNext() && 0<hash.capacity())
    {
        i.next();
        std::cout << i.key().toStdString() << ": " << i.value() << std::endl;
        arr[auxCont] = *(char*)i.key().toStdString().c_str();
        freq[auxCont] = i.value();
        auxCont++;
    }

    int sizeArray = strlen(arr);
    for (int i=0; i<sizeArray;i++)
    {
        QString jaja = "Lettre:"+QString(arr[i])+" : "+QString::number(freq[i]);
        qDebug()<< jaja;
        ui->textEdit->append(jaja);
    }


    HuffmanCodes(arr, freq, sizeArray);
    ui->textEdit->append("___HuffMan___");
    ui->textEdit->append(resultado);


}

void MainWindow::Dictionary(QString data,int by){
    int myByte = by;
    if(!hash.contains(data)){
        hash.insert(data, myByte);
        qDebug() << "ADD..";
    }
}
