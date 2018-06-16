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

    /**
     * @brief xmlRead   aplica las librerias de dom para estraer datos xml
     * @param xml
     */
    void xmlRead(QString xml);

    /**
     * @brief getData2  especifica que dato se desea extraer
     * @param root
     * @param data
     * @return
     */
    string getData2(QDomElement root, QString data);
    void xmlRead2(string xml);

    /**
     * @brief xmlUser   constructor del xml de user
     * @param user_
     * @param age_
     * @param friends_
     * @param lastname_
     * @param like_
     * @param name_
     * @param pass_
     * @return
     */
    QString xmlUser(QString user_, QString age_, QString friends_, QString lastname_, QString like_, QString name_, QString pass_);

    /**
     * @brief xmlTrack  constructor del xml del tracik
     * @param user_
     * @param album_
     * @param artist_
     * @param genre_
     * @param letter_
     * @param title_
     * @param year_
     * @return
     */
    QString xmlTrack(QString user_, QString album_, QString artist_, QString genre_, QString letter_, QString title_, QString year_,QString dir_, QString rate_);

    /**
     * @brief xmlHead   cabezera de la lista de xmls
     * @return
     */
    QDomElement xmlHead();

    /**
     * @brief trackListn anidan mas xml a la cabezera
     * @param user_
     * @param title_
     * @return
     */
    QDomElement trackList(QString user_, QString title_);

    /**
     * @brief buildList  definen a los segmentods de xml que pertenecen a un xml superior
     * @param list
     * @param track
     */
    void buildList(QDomElement list, QDomElement track);

    /**
     * @brief finishList    termina la construccion del xml anidado
     * @return
     */
    QString finishList();

    QString xmlTrack2(QString user_, QString letter_, QString title_, QString dir_, QString rate_);

private:
    QDomDocument document;
    QDomElement root;

};

#endif // XMLCONVERT_H
