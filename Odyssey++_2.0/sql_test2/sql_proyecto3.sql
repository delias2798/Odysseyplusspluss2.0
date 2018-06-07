/*drop SCHEMA Odyssey;
drop table Ody_user;
drop table Ody_friend;
drop table Ody_genre;
drop table Ody_like;*/

CREATE SCHEMA Odyssey;

Use Odyssey;


create table Ody_user(
	user_	varchar(12) not null,
    name_	varchar(20) not null,
    lastname_	varchar(20) not null,
    age_ int not null,
    primary key (user_)
);

create table Ody_friend(
	user_ varchar(12) not null,
    fuser_ varchar(12) not null,
    foreign key (user_) references Ody_user(user_),
    foreign key (fuser_) references Ody_user(user_)
);

create table Ody_genre(
	ID_ int not null auto_increment,
    genre_ varchar(20),
    primary key(ID_)
);

create table Ody_like(
	ID_ int,
    user_ varchar(20),
    foreign key (ID_) references Ody_genre(ID_),
    foreign key (user_) references Ody_user(user_),
    primary key(ID_,user_)
);


create table Ody_song(
	name_ varchar(20) not null,
    artist_ varchar(20) not null,
    year_ int,
    letter varchar(1000),
    ID_genre_ int not null,
    direcction_ varchar(500) not null,
    user_ varchar(12) not null,
    foreign key (ID_genre_) references Ody_genre(ID_),
    foreign key (user_) references Ody_user(user_)
);

create table Ody_video(
	name_ varchar(20) not null,
    description_ varchar(200),
    direcction_ varchar(500) not null,
    user_ varchar(12) not null,
    foreign key (user_) references Ody_user(user_)
);
insert into Ody_song values ('Hey jude','The beatles', 1980, 'heyyyyyy juuuuuudeeeeee!!!!!!',
2, 'aqui va la direccion del archivos', 'OTOR2');

select * from Ody_song;


/*test like*/
insert into Ody_like values (1,'OTOR');
insert into Ody_like values (2,'OTOR');
insert into Ody_like values (3,'EDD25');
insert into Ody_like values (4,'OTOR');
insert into Ody_like values (5,'Test');
select * from Ody_like;

DELETE FROM Ody_like WHERE ID_=3 AND user_='TestUser';

select user_, Ody_genre.genre_
from Ody_like
inner join Ody_genre on Ody_like.ID_=Ody_genre.ID_
where 'TestUser'=user_;


/*Teste de usuarios*/
insert into Ody_user values ('EDD25','Eduardo','Solano',22);
insert into Ody_user values ('OTOR','Otro','otro',10);
insert into Ody_user values ('Test','test','test',15);
select * from Ody_user;

/*friend list*//*Acomodar para no repetir amigos*/
insert into Ody_friend values ('Test','OTOR');
insert into Ody_friend values ('Test','EDD25');
select * from Ody_friend;

/*Test de tipos de generos */
insert into Ody_genre (genre_) values ('Rock');
insert into Ody_genre (genre_) values ('Jazz');
insert into Ody_genre (genre_) values ('Metal');
insert into Ody_genre (genre_) values ('Electro');
insert into Ody_genre (genre_) values ('Cumbia');
insert into Ody_genre (genre_) values ('Otro');
select * from Ody_genre;









