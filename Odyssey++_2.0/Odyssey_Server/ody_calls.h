#ifndef ODY_CALLS_H
#define ODY_CALLS_H
#include "mysql_calls.h"
#include "xmlconvert.h"
#include"huffman.h"
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

    /**
     * @brief DelFriend elimina a un solo amigo
     * @param root
     * @return
     */
    QString DelFriend(QDomElement root);

    /**
     * @brief NeedFriends   carga la listas de amigos del usuario
     * @param root
     * @return
     */
    QString NeedFriends(QDomElement root);

    /**
     * @brief needUser  carga la info de un usuario
     * @param root
     * @return
     */
    QString needUser(QDomElement root);

    /**
     * @brief updateUser    actualiza la info de un usuario
     * @param root
     * @return
     */
    QString updateUser(QDomElement root);

    /**
     * @brief needTrack carga una cancion de un usuario
     * @param user_
     * @param title_
     * @return
     */
    QString needTrack(QDomElement root);

    /**
     * @brief needAllTrack  carga la listas de canciones de un usuario
     * @param root
     * @return
     */
    QString needAllTrack(QDomElement root);

    /**
     * @brief addTrack  agrega metadata de una cancion a la base
     * @param root
     * @return
     */
    QString addTrack(QDomElement root);

    /**
     * @brief updateTrack   modifica la metadata de la cancion
     * @param root
     * @return
     */
    QString updateTrack(QDomElement root);
    QString delTreack(QDomElement root);

    /**
     * @brief Huff  realiza de descomprecion de huffman
     * @param root
     * @return
     */
    QString Huff(QDomElement root);

    /**
     * @brief login carga el inicio de sesion de un usuario
     * @param root
     * @return
     */
    QString login(QDomElement root);

    QString setRate(QDomElement root);

    QString addVideo(QDomElement root);

    QString delVideo(QDomElement root);

    QString needVideo(QDomElement root);

    QString needAllVideo(QDomElement root);

    QString setRateVideo(QDomElement root);

    QString updateVideo(QDomElement root);
private:
    xmlConvert xmlS;
};

#endif // ODY_CALLS_H
