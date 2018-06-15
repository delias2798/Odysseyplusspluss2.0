#include "xmlconvert.h"
#include <QByteArray>
#include <QDomDocument>

#include <QXmlStreamReader>
#include <QString>
#include <QBuffer>
xmlConvert::xmlConvert()
{

}

string xmlConvert::getData(QString data)
{
    QDomNodeList items = root.elementsByTagName(data);//element
    QDomNode itemnode = items.at(0);
    if(itemnode.isElement()){
        QDomElement itemele = itemnode.toElement();
        //qDebug() << itemele.text();
        return itemele.text().toUtf8().constData();
    }
    return "NULL";
}

void xmlConvert::xmlRead(QString xml)
{
    document.clear();
    root.clear();
    QByteArray bytes = xml.toUtf8();
    document.setContent(bytes);
    root = document.firstChildElement();
}

string xmlConvert::getData2(QDomElement root_, QString data)
{
    QDomNodeList items = root_.elementsByTagName(data);//element
    QDomNode itemnode = items.at(0);
    if(itemnode.isElement()){
        QDomElement itemele = itemnode.toElement();
        //qDebug() << itemele.text();
        return itemele.text().toUtf8().constData();
    }
    return "NULL";
}

void xmlConvert::xmlRead2(string xml)
{
    document.clear();
    root.clear();
    QString xml_=QString::fromStdString(xml);
    QByteArray bytes = xml_.toUtf8();

    document.setContent(bytes);

    root = document.firstChildElement();
}

QString xmlConvert::xmlUser(QString user_, QString age_, QString friends_, QString lastname_, QString like_, QString name_, QString pass_)
{
    QDomDocument doc;
    QDomProcessingInstruction instr = doc.createProcessingInstruction("xml", "version='1.0' encoding='UTF-8'");
    doc.appendChild(instr);

    QDomElement main = doc.createElement("user");


    QDomElement a = doc.createElement("username");
    QDomText user = doc.createTextNode(user_);

    QDomElement b = doc.createElement("age");
    QDomText age = doc.createTextNode(age_);

    QDomElement c = doc.createElement("friends");
    QDomText friends = doc.createTextNode(friends_);

    QDomElement d = doc.createElement("lastname");
    QDomText lastname = doc.createTextNode(lastname_);

    QDomElement e = doc.createElement("like");
    QDomText like = doc.createTextNode(like_);

    QDomElement f = doc.createElement("name");
    QDomText name = doc.createTextNode(name_);

    QDomElement g = doc.createElement("pass");
    QDomText pass = doc.createTextNode(pass_);


    doc.appendChild(main);
    main.appendChild(a);
    a.appendChild(user);
    main.appendChild(b);
    b.appendChild(age);
    main.appendChild(c);
    c.appendChild(friends);
    main.appendChild(d);
    d.appendChild(lastname);
    main.appendChild(e);
    e.appendChild(like);
    main.appendChild(f);
    f.appendChild(name);
    main.appendChild(g);
    g.appendChild(pass);


    QFile file( "/home/toshiba/Escritorio/Nuevo_server/d.xml" );
    if( !file.open( QIODevice::WriteOnly | QIODevice::Text ) )
    {
        qDebug( "Failed to open file for writing." );
    }
    else{
        QTextStream stream( &file );
        stream << doc.toString();
        file.close();
    }

    return doc.toString();
}

QString xmlConvert::xmlTrack(QString user_, QString album_, QString artist_, QString genre_, QString letter_, QString title_, QString year_)
{
    QDomDocument doc;
    QDomProcessingInstruction instr = doc.createProcessingInstruction("xml", "version='1.0' encoding='UTF-8'");
    doc.appendChild(instr);

    QDomElement main = doc.createElement("track");


    QDomElement a = doc.createElement("album");
    QDomText album = doc.createTextNode(album_);

    QDomElement b = doc.createElement("artist");
    QDomText artist = doc.createTextNode(artist_);

    QDomElement c = doc.createElement("genre");
    QDomText genre = doc.createTextNode(genre_);

    QDomElement d = doc.createElement("letter");
    QDomText letter = doc.createTextNode(letter_);

    QDomElement e = doc.createElement("title");
    QDomText title = doc.createTextNode(title_);

    QDomElement f = doc.createElement("year");
    QDomText year = doc.createTextNode(year_);

    QDomElement g = doc.createElement("username");
    QDomText user = doc.createTextNode(user_);


    doc.appendChild(main);
    main.appendChild(a);
    a.appendChild(album);
    main.appendChild(b);
    b.appendChild(artist);
    main.appendChild(c);
    c.appendChild(genre);
    main.appendChild(d);
    d.appendChild(letter);
    main.appendChild(e);
    e.appendChild(title);
    main.appendChild(f);
    f.appendChild(year);
    main.appendChild(g);
    g.appendChild(user);


    QFile file( "/home/toshiba/Escritorio/Nuevo_server/d.xml" );
    if( !file.open( QIODevice::WriteOnly | QIODevice::Text ) )
    {
        qDebug( "Failed to open file for writing." );
    }
    else{
        QTextStream stream( &file );
        stream << doc.toString();
        file.close();
    }
    return doc.toString();
}

QDomElement xmlConvert::xmlHead()
{
    document.clear();
    QDomProcessingInstruction instr = document.createProcessingInstruction("xml", "version='1.0' encoding='UTF-8'");
    document.appendChild(instr);

    QDomElement list = document.createElement("list");
    document.appendChild(list);
    return list;
    //qDebug()<<document.toString();
}

QDomElement xmlConvert::trackList(QString user_,QString title_)
{
    QDomElement main = document.createElement("track");


    QDomElement e = document.createElement("title");
    QDomText title = document.createTextNode(title_);


    QDomElement g = document.createElement("username");
    QDomText user = document.createTextNode(user_);


    main.appendChild(e);
    e.appendChild(title);

    main.appendChild(g);
    g.appendChild(user);

    return main;
}

void xmlConvert::buildList(QDomElement list, QDomElement track)
{
    list.appendChild(track);
}

QString xmlConvert::finishList()
{
    QFile file( "/home/toshiba/Escritorio/Nuevo_server/d.xml" );
    if( !file.open( QIODevice::WriteOnly | QIODevice::Text ) )
    {
        qDebug( "Failed to open file for writing." );
    }
    else{
        QTextStream stream( &file );
        stream << document.toString();
        file.close();
    }
    return document.toString();
}


/*QDomElement xmlConvert::trackList(QString user_, QString album_, QString artist_, QString genre_, QString letter_, QString title_, QString year_)
{
    QDomElement main = document.createElement("track");


    QDomElement a = document.createElement("album");
    QDomText album = document.createTextNode(album_);

    QDomElement b = document.createElement("artist");
    QDomText artist = document.createTextNode(artist_);

    QDomElement c = document.createElement("genre");
    QDomText genre = document.createTextNode(genre_);

    QDomElement d = document.createElement("letter");
    QDomText letter = document.createTextNode(letter_);

    QDomElement e = document.createElement("title");
    QDomText title = document.createTextNode(title_);

    QDomElement f = document.createElement("year");
    QDomText year = document.createTextNode(year_);

    QDomElement g = document.createElement("username");
    QDomText user = document.createTextNode(user_);

    main.appendChild(a);
    a.appendChild(album);
    main.appendChild(b);
    b.appendChild(artist);
    main.appendChild(c);
    c.appendChild(genre);
    main.appendChild(d);
    d.appendChild(letter);
    main.appendChild(e);
    e.appendChild(title);
    main.appendChild(f);
    f.appendChild(year);
    main.appendChild(g);
    g.appendChild(user);

    return main;
}*/

