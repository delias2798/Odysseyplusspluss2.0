#include "mysql_calls.h"

using namespace std;
calls::calls()
{
    server = "localhost";
    user = "root";
    pass ="123456";
    database = "Odyssey";
}

calls::~calls()
{

}


/**
 * @brief calls::mysql_connect objetivo conectar con sql
 * @return
 */
bool calls::mysql_connect()
{
    conn = mysql_init(NULL);

    if(!mysql_real_connect(conn,server,user,pass,database,0,NULL,0)){//realiza comunicacion con sql
        cout<<"Error coneccion"<<endl;                               //si se conecta correctamente true de lo contrario false
        return false;
    }
    cout<<"Acceso"<<endl;
    return true;
}

/**
 * @brief calls::mysql_disconnect objetivo desconectarse con sql
 */
void calls::mysql_disconnect()
{
    mysql_close(conn);//cierra la coneccion
    cout<<"Cerrado"<<endl;
}

/**
 * @brief calls::mysql_command objetivo procesar el comando en sql
 * @param sql_line
 * @return
 */
bool calls::mysql_command(string sql_line)
{
    const char *sql_comand=sql_line.c_str();
    if(mysql_query(conn,sql_comand)){//requiere el uso de char*
        fprintf(stderr,"%s\n",mysql_error(conn));//muetra los problemas que tenga con sql
        mysql_disconnect();
        return false;
    }
    cout<<"Guardado"<<endl;
    mysql_disconnect();
    return true;
}

/**
 * @brief calls::mysql_answer   objetivo procesar el comando en sql y esperar la respuesta
 * @param sql_line
 */
void calls::mysql_answer(string sql_line)
{
    const char *sql_comand=sql_line.c_str();
    if(mysql_query(conn,sql_comand)){
        fprintf(stderr,"%s\n",mysql_error(conn));
        mysql_disconnect();
    }
    res=mysql_use_result(conn);//se guardan las respuestas en una row
}

/**
 * @brief calls::mysql_endanswer    objetivo descoinectarse con sql y hacer limpieza de las respuesta anterior
 */
void calls::mysql_endanswer()
{
    mysql_free_result(res);
    mysql_disconnect();
}

/**
 * @brief calls::QStr   objetivo convertir string en qstrings
 * @param txt
 * @return
 */
QString calls::QStr(string txt)
{
    return QString::fromStdString(txt);
}

/**
 * @brief calls::addUser    objetivo agregar un nuevo usuario a la bd
 * @param user_
 * @param pass_
 * @param name_
 * @param lastname_
 * @param age_
 * @return
 */
bool calls::addUser(string user_, string pass_, string name_, string lastname_, string age_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_user VALUES ('"+user_+"', '"+pass_+"', '"+name_+"', "
                "'"+lastname_+"', "+age_+")";//comando en sql
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

/**
 * @brief calls::updateUser objetivo dar update a un usuario
 * @param user_
 * @param pass_
 * @param name_
 * @param lastname_
 * @param age_
 * @return
 */
bool calls::updateUser(string user_, string pass_, string name_, string lastname_, string age_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_user "
                        "SET pass_='"+pass_+"', name_='"+name_+"', lastname_='"+lastname_+"', age_="+age_+" "
                        "WHERE user_='"+user_+"'";//comando sql
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

/**
 * @brief calls::addLike    objetivo agregar gustos a un usuario
 * @param ID_
 * @param user_
 * @return
 */
bool calls::addLike(string ID_, string user_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_like VALUES ("+ID_+", '"+user_+"')";//comando sql
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

/**
 * @brief calls::deleteLike     objetivo eliminar los gustos de un usuario
 * @param user_
 * @return
 */
bool calls::deleteLike(string user_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_like WHERE user_='"+user_+"'";//comando sql
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

/**
 * @brief calls::addFriend  objetivo agregar un nuevo amigo al usuario
 * @param user_
 * @param fuser_
 * @return
 */
bool calls::addFriend(string user_, string fuser_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_friend VALUES ('"+user_+"', '"+fuser_+"')";//comando sql
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

/**
 * @brief calls::deleteFriend objetivo eliminar a un amigo de un usuario
 * @param user_
 * @param fuser_
 * @return
 */
bool calls::deleteFriend(string user_, string fuser_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_friend WHERE user_='"+user_+"' AND fuser_='"+fuser_+"'";//comando sql
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

/**
 * @brief calls::addSong    objetivo agregar
 * @param name_
 * @param artist_
 * @param year_
 * @param letter_
 * @param album_
 * @param ID_genre_
 * @param direction_
 * @param user_
 * @param rate_
 * @return
 */
bool calls::addSong(string name_, string artist_, string year_, string letter_, string album_,string ID_genre_, string direction_, string user_, string rate_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_song VALUES ('"+name_+"', '"+artist_+"', "+year_+", '"+letter_+"', '"+album_+"',"+ID_genre_+", '"+direction_+"', '"+user_+"', "+rate_+")";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::updateSong(string name_, string artist_, string year_, string letter_, string album_, string ID_genre_, string direction_, string user_, string rate_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_song "
                        "SET year_="+year_+", letter_='"+letter_+"', ID_genre_="+ID_genre_+", album_='"+album_+"', artist_='"+artist_+"' "
                        "WHERE name_='"+name_+"' AND user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::deleteSong(string name_, string user_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_song WHERE name_='"+name_+"' AND user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::addVideo(string name_, string desctiption_, string direction_, string user_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_video VALUES ('"+name_+"', '"+desctiption_+"', '"+direction_+"', '"+user_+"', 0)";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::updateVideo(string name_, string desctiption_, string direction_, string user_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_video "
                        "SET description_='"+desctiption_+"'"
                        "WHERE name_='"+name_+"' AND user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::deleteVideo(string name_, string user_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_video WHERE name_='"+name_+"' AND user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::login(string user_, string pass_)
{
    if(mysql_connect()){
        string sql_line="SELECT * FROM Ody_user WHERE user_='"+user_+"' AND pass_='"+pass_+"'";
        cout<<sql_line<<endl;
        mysql_answer(sql_line);
        if((row=mysql_fetch_row(res)) != NULL){
            cout<<1<<endl;
            mysql_endanswer();
            return true;
        }
        mysql_endanswer();
    }
    return false;
}

QString calls::needUser(string user_)
{
    string pass_, name_, lastname_, age_, friends_, like_;
    if(mysql_connect()){
        string sql_line="SELECT * FROM Ody_user WHERE user_='"+user_+"'";
        cout<<sql_line<<endl;
        mysql_answer(sql_line);
        if((row=mysql_fetch_row(res)) != NULL){
            pass_=row[1];
            name_=row[2];
            lastname_=row[3];
            age_=row[4];
        }
        mysql_endanswer();
        friends_=needFriends(user_);
        like_=needLike(user_);
        xmlConvert *xml = new xmlConvert();
        return xml->xmlUser(QStr(user_),QStr(age_),QStr(friends_),QStr(lastname_),QStr(like_),QStr(name_),QStr(pass_));
    }
    return "FALSE";
}

string calls::needFriends(string user_)
{
    string friends_="";
    if(mysql_connect()){
        string sql_line="SELECT * FROM Ody_friend WHERE user_='"+user_+"'";
        cout<<sql_line<<endl;
        mysql_answer(sql_line);
        while((row=mysql_fetch_row(res)) != NULL){
            friends_=friends_+row[1]+" ";
        }
        mysql_endanswer();
        return friends_;
    }
    return " ";
}

string calls::needLike(string user_)
{
    string like_="";
    if(mysql_connect()){
        string sql_line="SELECT * FROM Ody_like WHERE user_='"+user_+"'";
        cout<<sql_line<<endl;
        mysql_answer(sql_line);
        while((row=mysql_fetch_row(res)) != NULL){
            like_=like_+row[0]+" ";
        }
        mysql_endanswer();
        return like_;
    }
    return " ";
}

QString calls::needTrack(string user_, string title_)
{
    string artist_, year_, letter_, genre_, album_, dir_, rate_;
    if(mysql_connect()){
        string sql_line="SELECT * FROM Ody_song WHERE user_='"+user_+"' AND name_='"+title_+"'";
        cout<<sql_line<<endl;
        mysql_answer(sql_line);
        if((row=mysql_fetch_row(res)) != NULL){
            artist_=row[1];
            year_=row[2];
            letter_=row[3];
            album_=row[4];
            genre_=row[5];
            dir_=row[6];
            rate_=row[8];
        }
        mysql_endanswer();
        xmlConvert *xml = new xmlConvert();
        return xml->xmlTrack(QStr(user_),QStr(album_),QStr(artist_),QStr(genre_),QStr(letter_),QStr(title_),QStr(year_),QStr(dir_),QStr(rate_));
    }
    return "FALSE";
}

QString calls::needAllTrack(string user)
{
    string user_, title_;
    if(mysql_connect()){
        string sql_line="SELECT name_, user_ FROM Ody_song WHERE user_='"+user+"'";
        cout<<sql_line<<endl;
        xmlConvert *xml = new xmlConvert();
        QDomElement list=xml->xmlHead();
        mysql_answer(sql_line);
        while((row=mysql_fetch_row(res)) != NULL){
            title_=row[0];
            user_=row[1];
            xml->buildList(list,xml->trackList(QStr(user_),QStr(title_)));
        }
        mysql_endanswer();


        return xml->finishList();
    }
    return "False";
}

bool calls::setRate(string user, string title, string rate)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_song "
                        "SET rate_="+rate+" "
                        "WHERE name_='"+title+"' AND user_='"+user+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

QString calls::needVideo(string user_, string title_)
{
    string letter_, dir_, rate_;
    if(mysql_connect()){
        string sql_line="SELECT * FROM Ody_video WHERE user_='"+user_+"' AND name_='"+title_+"'";
        cout<<sql_line<<endl;
        mysql_answer(sql_line);
        if((row=mysql_fetch_row(res)) != NULL){
            letter_=row[1];
            dir_=row[2];
            rate_=row[4];
        }
        mysql_endanswer();
        xmlConvert *xml = new xmlConvert();
        return xml->xmlTrack2(QStr(user_),QStr(letter_),QStr(title_),QStr(dir_),QStr(rate_));
    }
    return "FALSE";
}

QString calls::needAllVideo(string user)
{
    string user_, title_;
    if(mysql_connect()){
        string sql_line="SELECT name_, user_ FROM Ody_video WHERE user_='"+user+"'";
        cout<<sql_line<<endl;
        xmlConvert *xml = new xmlConvert();
        QDomElement list=xml->xmlHead();
        mysql_answer(sql_line);
        while((row=mysql_fetch_row(res)) != NULL){
            title_=row[0];
            user_=row[1];
            xml->buildList(list,xml->trackList(QStr(user_),QStr(title_)));
        }
        mysql_endanswer();


        return xml->finishList();
    }
    return "False";
}

bool calls::setRateV(string user, string title, string rate)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_video "
                        "SET rate_="+rate+" "
                        "WHERE name_='"+title+"' AND user_='"+user+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}



/*bool calls::addUser()
{
    if(mysql_connect()){
        string sql_line="SELECT * FROM Ody_user WHERE user_='"+user_+"' AND pass_='"+pass_+"'";
        cout<<sql_line<<endl;
        mysql_answer(sql_line);
        if((row=mysql_fetch_row(res)) != NULL){
             printf("%s \n",row[0]);
             printf("%s \n",row[1]);
        }
        mysql_endanswer();

    }
}*/
