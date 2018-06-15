#include "ody_calls.h"

ody_calls::ody_calls()
{
    xmlS = xmlConvert();
}

QString ody_calls::answer(QString xml)
{
    string tag, name, pass;
    QString xml_=xml.mid(55,xml.length());
    QDomDocument document;
    QDomElement root;
    QByteArray bytes = xml_.toUtf8();
    document.setContent(bytes);
    root = document.firstChildElement();
    tag=xmlS.getData2(root,"tag");
    if(tag=="GoLogin")
        return login(root);

    if(tag=="AddUser")
        return addUser(root);

    if(tag=="NeedUser")
        return needUser(root);

    if(tag=="UpdateUser")
        return updateUser(root);

    if(tag=="AddFriends")
        return NewFriend(root);

    if(tag=="DelFriends")
        return DelFriend(root);

    if(tag=="NeedFriends")
        return needUser(root);



    return "?????";



}

QString ody_calls::addUser(QDomElement root)
{
    string user_, name_, pass_, lastname_, age_, friends_, like_;
    user_=xmlS.getData2(root,"username");
    pass_=xmlS.getData2(root,"pass");
    name_=xmlS.getData2(root,"name");
    lastname_=xmlS.getData2(root,"lastname");
    age_=xmlS.getData2(root,"age");
    friends_=xmlS.getData2(root,"friends");
    like_=xmlS.getData2(root,"like");
    calls *sql = new calls();
    if(sql->addUser(user_,pass_,name_,lastname_,age_)){
        addFriend(user_,friends_);
        addLike(user_,like_);
        return "TRUE";
    }
    return "FALSE";
}

void ody_calls::addFriend(string user_, string friends_)
{
    std::string code=friends_;
    int x;
    std::string new_friend="";
    std::string find=" ";
    size_t found;
    while(code!=""){
        x=code.size();
        found=code.find(find)+1;
        new_friend=code.substr(0,found-1);
        code=code.substr(found,x);
        /////////////////////////////////
        //separa los elementos x espacios
        calls *sql = new calls();
        sql->addFriend(user_,new_friend);
        if(found==0)
            code="";
    }
    //std::cout<<code_end<<std::endl;
}

void ody_calls::addLike(string user_, string like_)
{
    std::string code=like_;
    int x;
    std::string new_like="";
    std::string find=" ";
    size_t found;
    while(code!=""){
        x=code.size();
        found=code.find(find)+1;
        new_like=code.substr(0,found-1);
        code=code.substr(found,x);
        /////////////////////////////////
        //separa los elementos x espacios
        calls *sql = new calls();
        sql->addLike(new_like,user_);
        if(found==0)
            code="";
    }

}

QString ody_calls::NewFriend(QDomElement root)
{
    string user, friends;
    user=xmlS.getData2(root,"username");
    friends=xmlS.getData2(root,"friends");
    calls *sql = new calls();
    if(sql->addFriend(user,friends))
        return "TRUE";
    return "FALSE";
}

QString ody_calls::DelFriend(QDomElement root)
{
    string user, friends;
    user=xmlS.getData2(root,"username");
    friends=xmlS.getData2(root,"friends");
    calls *sql = new calls();
    if(sql->deleteFriend(user,friends))
        return "TRUE";
    return "FALSE";
}

QString ody_calls::NeedFriends(QDomElement root)
{

}

QString ody_calls::needUser(QDomElement root)
{
    string user;
    user=xmlS.getData2(root,"username");
    calls *sql = new calls();
    return sql->needUser(user);
}

QString ody_calls::updateUser(QDomElement root)
{
    string user_, name_, pass_, lastname_, age_, friends_, like_;
    user_=xmlS.getData2(root,"username");
    pass_=xmlS.getData2(root,"pass");
    name_=xmlS.getData2(root,"name");
    lastname_=xmlS.getData2(root,"lastname");
    age_=xmlS.getData2(root,"age");
    friends_=xmlS.getData2(root,"friends");
    like_=xmlS.getData2(root,"like");
    calls *sql = new calls();
    if(sql->updateUser(user_,pass_,name_,lastname_,age_)){
        sql->deleteLike(user_);
        addFriend(user_,friends_);
        addLike(user_,like_);
        return "TRUE";
    }
    return "FALSE";
}

QString ody_calls::login(QDomElement root)
{
    string user, pass;
    user=xmlS.getData2(root,"username");
    pass=xmlS.getData2(root,"pass");
    //cout<<user+" "+pass<<endl;
    calls *sql = new calls();
    if(sql->login(user,pass))
        return "TRUE";
    return "FALSE";
}

QString ody_calls::needTrack(string user_, string title_)
{
    calls *sql = new calls();
    return sql->needTrack(user_,title_);
}

QString ody_calls::needAllTrack()
{
    calls *sql = new calls();
    return sql->needAllTrack();
}


