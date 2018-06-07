#ifndef MYSQL_CALLS_H
#define MYSQL_CALLS_H
#include <iostream>
#include <cstdlib>
#include <mysql/mysql.h>
using namespace std;
class calls
{
public:
    calls();
    ~calls();
    /**
     * @brief addUser Agrega usuarios a la base de datods
     * @param user_
     * @param name_
     * @param lastname_
     * @param age_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool addUser(string user_, string name_, string lastname_, string age_);
    /**
     * @brief updateUser Modifica el usuario de la base de datos
     * @param user_
     * @param name_
     * @param lastname_
     * @param age_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool updateUser(string user_, string name_, string lastname_, string age_);

    /**
     * @brief addLike Agrega gustos a un usuario de la base de datos
     * @param ID_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool addLike(string ID_,string user_);
    /**
     * @brief deleteLike Elimina gustos a un usuarion de la base de datos
     * @param ID_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool deleteLike(string ID_,string user_);

    /**
     * @brief addFriend Agrega amigos a un usuario de la base de datos
     * @param user_
     * @param fuser_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool addFriend(string user_, string fuser_);
    /**
     * @brief deleteFriend Elimina amigos a un usuario de la base de datos
     * @param user_
     * @param fuser_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool deleteFriend(string user_, string fuser_);

    /**
     * @brief addSong Agraga metadata de las canciones a la base de datos
     * @param name_
     * @param artist_
     * @param year_
     * @param letter_
     * @param ID_genre_
     * @param direction_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool addSong(string name_, string artist_, string year_, string letter_, string ID_genre_, string direction_, string user_);
    /**
     * @brief updateSong Modifica la metadata de una cancion de la base de datos
     * @param name_
     * @param artist_
     * @param year_
     * @param letter_
     * @param ID_genre_
     * @param direction_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool updateSong(string name_, string artist_, string year_, string letter_, string ID_genre_, string direction_, string user_);
    /**
     * @brief deleteSong Elimina una cancion de la base de datos
     * @param name_
     * @param artist_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool deleteSong(string name_, string artist_, string user_);

    /**
     * @brief addVideo Agrega la metadata de un video a la base de datos
     * @param name_
     * @param desctiption_
     * @param direction_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool addVideo(string name_, string desctiption_,string direction_,string user_);
    /**
     * @brief updateVideo Modifica la metadata de un video de la base de datos
     * @param name_
     * @param desctiption_
     * @param direction_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool updateVideo(string name_, string desctiption_,string direction_,string user_);
    /**
     * @brief deleteVideo Elimina un video de la base de datos
     * @param name_
     * @param user_
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool deleteVideo(string name_, string user_);



private:
    /**
     * @brief mysql_connect realiza la comunicacion entre c++ y mysql
     * @return
     */
    bool mysql_connect();
    /**
     * @brief mysql_disconnect realiza el cierre de la comunicacion entre c++ y mysql
     */
    void mysql_disconnect();
    /**
     * @brief mysql_command realiza el comando de la linea de sql
     * @param sql_line string con formato de la instruccion de sql
     * @return true si fue agregado correctamente y false si sucedio un error
     */
    bool mysql_command(string sql_line);

private:
    MYSQL *conn;
    MYSQL_RES *res;
    MYSQL_ROW row;

    const char *server;
    const char *user;
    const char *pass;
    const char *database;

};

#endif // MYSQL_CALLS_H
