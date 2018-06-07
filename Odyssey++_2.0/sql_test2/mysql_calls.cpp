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
        cout<<"Error"<<endl;
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

bool calls::addUser(string user_, string name_, string lastname_, string age_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_user VALUES ('"+user_+"', '"+name_+"', "
                "'"+lastname_+"', "+age_+")";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::updateUser(string user_, string name_, string lastname_, string age_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_user "
                        "SET name_='"+name_+"', lastname_='"+lastname_+"', age_="+age_+" "
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

bool calls::deleteLike(string ID_, string user_)
{
    if(mysql_connect()){
        string sql_line="DELETE FROM Ody_like WHERE ID_="+ID_+" AND user_='"+user_+"'";
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

bool calls::addSong(string name_, string artist_, string year_, string letter_, string ID_genre_, string direction_, string user_)
{
    if(mysql_connect()){
        string sql_line="INSERT INTO Ody_song VALUES ('"+name_+"', '"+artist_+"', "+year_+", '"+letter_+"', "+ID_genre_+", '"+direction_+"', '"+user_+"')";
        cout<<sql_line<<endl;
        return mysql_command(sql_line);
    }
    return false;
}

bool calls::updateSong(string name_, string artist_, string year_, string letter_, string ID_genre_, string direction_, string user_)
{
    if(mysql_connect()){
        string sql_line="UPDATE Ody_song "
                        "SET year_="+year_+", letter_='"+letter_+"', ID_genre_="+ID_genre_+", direction_='"+direction_+"'"
                        "WHERE name_='"+name_+"' AND artist_='"+artist_+"' AND user_='"+user_+"'";
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


/*bool calls::addUser()
{
    string sql_line="SELECT age_ FROM Ody_user ";
    string variable="where user_ = 'OTOR';";
    //sql_line=sql_line+variable;
    cout<<sql_line<<endl;
    const char *sql_comand=sql_line.c_str();

    if(mysql_query(conn,sql_comand)){
        fprintf(stderr,"%s\n",mysql_error(conn));

    }
    res=mysql_use_result(conn);
    while((row=mysql_fetch_row(res)) != NULL){
     printf("%s \n",row[0]);
    }
}*/


