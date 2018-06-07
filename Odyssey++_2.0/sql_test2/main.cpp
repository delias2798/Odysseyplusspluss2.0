#include <QCoreApplication>
#include <iostream>
#include <cstdlib>

#include <mysql/mysql.h>
#include "mysql_calls.h"

using namespace std;

int main(int argc, char *argv[])
{
    QCoreApplication a(argc, argv);

    calls *sql_ = new calls();

    //sql_->addUser("TestUser","test","olah","7");
    //sql_->updateUser("TestUser","update","hola44","777");
    //sql_->addLike("4","TestUser");
    //sql_->addLike("3","TestUser");
    //sql_->deleteLike("4","TestUser");
    //sql_->addFriend("TestUser","OTOR");
    //sql_->deleteFriend("TestUser","OTOR");
    //sql_->addSong("Hey Jude","The Beatles","1980","hey juuuuuuuude","1","aqui va la direccion de la cancion","TestUser");
    //sql_->updateSong("Hey Jude","The Beatles","1960","juuude hey","1","nueva direccion","TestUser");
    //sql_->deleteSong("Hey Jude","The eatles","TestUser");
    sql_->addVideo("video loco","vean esto mis amigos","youtube.com","TestUser");
    //sql_->updateVideo("video loco","vean esto mis amigos2","www.youtube.com","TestUser");
    sql_->deleteVideo("video loco","TestUser");



    /*MYSQL *conn;
    MYSQL_RES *res;
    MYSQL_ROW row;

    char *server = "localhost";
    char *user = "root";
    char *pass ="123456";
    char *database = "Odyssey";

    conn = mysql_init(NULL);

    if(!mysql_real_connect(conn,server,user,pass,database,0,NULL,0)){
        cout<<"Error"<<endl;
        return 1;
    }
    cout<<"Acceso"<<endl;
    string sql_line="SELECT name_ FROM Ody_user ";
    string variable="where user_ = 'OTOR';";
    sql_line=sql_line+variable;
    cout<<sql_line<<endl;
    const char *sql_comand=sql_line.c_str();

    if(mysql_query(conn,sql_comand)){
        fprintf(stderr,"%s\n",mysql_error(conn));
        return 1;
    }
    res=mysql_use_result(conn);
    while((row=mysql_fetch_row(res)) != NULL){
     printf("%s \n",row[0]);
    }

    mysql_free_result(res);
    mysql_close(conn);*/


    return a.exec();
}


