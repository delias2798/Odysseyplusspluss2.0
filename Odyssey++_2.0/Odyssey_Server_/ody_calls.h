#ifndef ODY_CALLS_H
#define ODY_CALLS_H
#include "mysql_calls.h"
#include "xmlconvert.h"
#include <iostream>
#include <QString>

class ody_calls
{
public:
    ody_calls();
    /**
     * @brief answer funcion encargada de todos los comandos de comunicacion
     * @param xml   xml del contenido a procesar
     * @return      mensaje predeterminado segun lo requerido
     */
    QString answer(QString xml);

    /**
     * @brief addUser   agregar nuevo usuario
     * @param root      permite acceder a la informacion del xml
     * @return          true si fue agregado y false el username ya existe
     */
    QString addUser(QDomElement root);

    /**
     * @brief addFriend agrega una lista de amigos
     * @param user_
     * @param friends_
     */
    void addFriend(std::string user_, std::string friends_);

    /**
     * @brief addLike   agrega una lista de gustos musicales
     * @param user_
     * @param like_
     */
    void addLike(std::string user_, std::string like_);

    /**
     * @brief NewFriend agrega a un solo
     * @param root
     * @return
     */
    QString NewFriend(QDomElement root);
    QString DelFriend(QDomElement root);
    QString NeedFriends(QDomElement root);
    QString needUser(QDomElement root);
    QString updateUser(QDomElement root);
    QString needTrack(string user_, string title_);
    QString needAllTrack();

    QString login(QDomElement root);
private:
    xmlConvert xmlS;
};

#endif // ODY_CALLS_H
