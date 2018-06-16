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



bool calls::mysql_connect()
{
    conn = mysql_init(NULL);

    if(!mysql_real_connect(conn,server,user,pass,database,0,NULL,0)){
        cout<<"Error coneccion"<<endl;
        return false;
    }
    cout<<"Acceso"<<endl;
    return true;
}

void calls::mysql_disconnect()
{
    mysql_close(conn);
    cout<<"Cerrado"<<endl;
}

bool calls::mysql_command(string sql_line)
{
    const char *sql_comand=sql_line.c_str();
    if(mysql_query(conn,sql_comand)){
        fprintf(stderr,"%s\n",mysql_error(conn));
        mysql_disconnect();
        return false;
    }
    cout<<"Guardado"<<endl;
    mysql_disconnect();
    return true;
}

void calls::mysql_answer(string sql_line)
{
    const char *sql_comand=sql_line.c_str();
    if(mysql_query(conn,sql_comand)){
        fprintf(stderr,"%s\n",mysql_error(conn));
        mysql_disconnect();
    }
    res=mysql_use_result(conn);
}

void calls::mysql_endanswer()
{
    mysql_free_result(res);
    mysql_disconnect();
}

QString calls::QStr(string txt)
{
    return QString::fromStdString(txt);
}

bool calls::addUser(string user_, string pass_, string name_, string lastname_, string age_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_user VALUES ('"+user_+"', '"+pass_+"', '"+name_+"', "
                "'"+lastname_+"', "+age_+")";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::updateUser(string user_, string pass_, string name_, string lastname_, string age_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_user "
                        "SET pass_='"+pass_+"', name_='"+name_+"', lastname_='"+lastname_+"', age_="+age_+" "
                        "WHERE user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}


bool calls::addLike(string ID_, string user_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_like VALUES ("+ID_+", '"+user_+"')";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::deleteLike(string user_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_like WHERE user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::addFriend(string user_, string fuser_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_friend VALUES ('"+user_+"', '"+fuser_+"')";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::deleteFriend(string user_, string fuser_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_friend WHERE user_='"+user_+"' AND fuser_='"+fuser_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::addSong(string name_, string artist_, string year_, string letter_, string album_,string ID_genre_, string direction_, string user_, string rate_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_song VALUES ('"+name_+"', '"+artist_+"', "+year_+", '"+letter_+"', '"+album_+"',"+ID_genre_+", '"+direction_+"', '"+user_+"',"+rate_+")";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::updateSong(string name_, string artist_, string year_, string letter_, string album_, string ID_genre_, string direction_, string user_, string rate_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_song "
                        "SET year_="+year_+", letter_='"+letter_+"', ID_genre_="+ID_genre_+", direction_='"+direction_+"', album_='"+album_+"', rate_="+rate_+", artist_='"+artist_+"'"
                        "WHERE name_='"+name_+"' AND user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::deleteSong(string name_, string artist_, string user_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_song WHERE name_='"+name_+"' AND artist_='"+artist_+"' AND user_='"+user_+"'";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::addVideo(string name_, string desctiption_, string direction_, string user_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_video VALUES ('"+name_+"', '"+desctiption_+"', '"+direction_+"', '"+user_+"')";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::updateVideo(string name_, string desctiption_, string direction_, string user_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_video "
                        "SET description_='"+desctiption_+"', direction_='"+direction_+"' "
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
    string artist_, year_, letter_, genre_, album_;
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
        }
        mysql_endanswer();
        xmlConvert *xml = new xmlConvert();
        return xml->xmlTrack(QStr(user_),QStr(album_),QStr(artist_),QStr(genre_),QStr(letter_),QStr(title_),QStr(year_));
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
