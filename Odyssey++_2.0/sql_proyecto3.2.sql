/*drop SCHEMA Odyssey;
drop table Ody_user;
drop table Ody_friend;
drop table Ody_genre;
drop table Ody_like;
drop table Ody_song;
drop table Ody_video;*/

CREATE SCHEMA Odyssey;

Use Odyssey;


create table Ody_user(
	user_	varchar(12) not null,
    pass_	varchar(12) not null,
    name_	varchar(20) not null,
    lastname_	varchar(20) not null,
    age_ int not null,
    primary key (user_)
);

create table Ody_friend(
	user_ varchar(12) not null,
    fuser_ varchar(12) not null,
    foreign key (user_) references Ody_user(user_),
    foreign key (fuser_) references Ody_user(user_),
    primary key(user_,fuser_)
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
    artist_ varchar(20) ,
    year_ int,
    letter_ varchar(1000),
    album_ varchar(20),
    ID_genre_ int,
    direction_ varchar(500),
    user_ varchar(12) not null,
    rate_ int,
    foreign key (ID_genre_) references Ody_genre(ID_),
    foreign key (user_) references Ody_user(user_),
    primary key (user_, name_)
);

create table Ody_video(
	name_ varchar(20) not null,
    description_ varchar(200),
    direction_ varchar(500) not null,
    user_ varchar(12) not null,
    foreign key (user_) references Ody_user(user_),
    primary key (user_, name_)
);
insert into Ody_song values ('Hey jude3','The beatles', 1980, 'heyyyyyy juuuuuudeeeeee!!!!!!',' dfs',
2,'aqui va la direccion del archivos', 'OTOR');

select * from Ody_song;
select * from Ody_video;


/*test like*/
insert into Ody_like values (1,'OTOR');
insert into Ody_like values (2,'OTOR');
insert into Ody_like values (3,'EDD25');
insert into Ody_like values (4,'OTOR');
insert into Ody_like values (5,'Test');
insert into Ody_like values (5,'EDD25');
insert into Ody_like values (8,'EDD25');
insert into Ody_like values (14,'EDD25');
select * from Ody_like;

DELETE FROM Ody_like WHERE ID_=3 AND user_='TestUser';

select user_, Ody_genre.genre_
from Ody_like
inner join Ody_genre on Ody_like.ID_=Ody_genre.ID_
where 'edd22'=user_;


/*Teste de usuarios*/

insert into Ody_user values ('OTOR','dsfgf','Otro','otro',10);
insert into Ody_user values ('Test4','hgfdf','test','test',15);
select * from Ody_user;
DELETE FROM Ody_user WHERE user_='edd';

/*friend list*//*Acomodar para no repetir amigos*/
insert into Ody_friend values ('Test','OTOR');
insert into Ody_friend values ('Test','EDD25');
insert into Ody_friend values ('edd','Test4');
select * from Ody_friend where user_='edd';
/*Test de tipos de generos */
insert into Ody_genre (genre_) values ('Rock');
insert into Ody_genre (genre_) values ('Hip-Hop');
insert into Ody_genre (genre_) values ('Rock&Roll');
insert into Ody_genre (genre_) values ('Balada');
insert into Ody_genre (genre_) values ('Pop');
insert into Ody_genre (genre_) values ('Reggae');
insert into Ody_genre (genre_) values ('Rap');
insert into Ody_genre (genre_) values ('Banda');
insert into Ody_genre (genre_) values ('Electro');
insert into Ody_genre (genre_) values ('Bachata');
insert into Ody_genre (genre_) values ('Trash Metal');
insert into Ody_genre (genre_) values ('Dance');
insert into Ody_genre (genre_) values ('Salsa');
insert into Ody_genre (genre_) values ('Ska');
insert into Ody_genre (genre_) values ('Jazz');
insert into Ody_genre (genre_) values ('Punk');
select * from Ody_genre;









