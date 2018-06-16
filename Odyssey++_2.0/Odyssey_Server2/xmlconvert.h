#ifndef XMLCONVERT_H
#define XMLCONVERT_H
#include <iostream>
#include <cstdlib>
#include <iostream>
#include <fstream>
#include <QString>
#include <QtXml>
#include <QDebug>
using namespace std;

class xmlConvert
{
public:
    xmlConvert();

    string getData(QString data);
    void xmlRead(QString xml);

    string getData2(QDomElement root, QString data);
    void xmlRead2(string xml);

    QString xmlUser(QString user_, QString age_, QString friends_, QString lastname_, QString like_, QString name_, QString pass_);

    QString xmlTrack(QString user_, QString album_, QString artist_, QString genre_, QString letter_, QString title_, QString year_);

    QDomElement xmlHead();
    QDomElement trackList(QString user_, QString title_);
    void buildList(QDomElement list, QDomElement track);
    QString finishList();

private:
    QDomDocument document;
    QDomElement root;

};

#endif // XMLCONVERT_H
