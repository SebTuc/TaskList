-- DROP DATABASE TaskList;
CREATE DATABASE TaskList;
USE TaskList;

CREATE TABLE Types(
	id_type int(10) NOT NULL AUTO_INCREMENT ,
	nom varchar(25) NOT NULL,
	PRIMARY KEY(id_type)
	) ENGINE=INNODB;

CREATE TABLE Theme(
	id_theme int(10) NOT NULL AUTO_INCREMENT,
	nom varchar(50) NOT NULL,
	id_type int(10) NOT NULL,
	PRIMARY KEY(id_theme),
	CONSTRAINT FK_themeType
	FOREIGN KEY(id_type) REFERENCES Types(id_type)
	) ENGINE=INNODB;
	
CREATE TABLE Liste(
	id_liste INT(10) NOT NULL AUTO_INCREMENT,
	id_theme int(10) NOT NULL,
	message varchar(200) NOT NULL,
	PRIMARY KEY(id_liste),
	CONSTRAINT FK_listeTheme
	FOREIGN KEY(id_theme) REFERENCES Theme(id_theme)
	) ENGINE=INNODB;
	
-- JEU DE DONNEE :
INSERT INTO Types(nom) VALUE('Task');
INSERT INTO Types(nom) VALUE('Simple');


INSERT INTO Theme(nom,id_type) VALUE('Test Task' , (SELECT id_type FROM Types Where nom='Task'));
INSERT INTO Theme(nom,id_type) VALUE('Test Simple' , (SELECT id_type FROM Types Where nom='Simple'));
INSERT INTO Theme(nom,id_type) VALUE('Test Theme' , (SELECT id_type FROM Types Where nom='Task'));
INSERT INTO Theme(nom,id_type) VALUE('Simple truc' , (SELECT id_type FROM Types Where nom='Simple'));


INSERT INTO Liste(id_theme,message) VALUE((SELECT id_theme FROM Theme Where nom='Test Task'),'Je suis un message avec une case a cocher pour dire que j\' ai était réaliser !');
INSERT INTO Liste(id_theme,message) VALUE((SELECT id_theme FROM Theme Where nom='Test Task'),'Et Hop encore un !');
INSERT INTO Liste(id_theme,message) VALUE((SELECT id_theme FROM Theme Where nom='Test Task'),'Quoi encore un autre ?');

INSERT INTO Liste(id_theme,message) VALUE((SELECT id_theme FROM Theme Where nom='Test Simple'),'La je suis qu\'un texte simple pour me rappeler d\'une tache ');
INSERT INTO Liste(id_theme,message) VALUE((SELECT id_theme FROM Theme Where nom='Test Task'),'Et Hop encore un !');
INSERT INTO Liste(id_theme,message) VALUE((SELECT id_theme FROM Theme Where nom='Test Task'),'Et on peut en faire plein !');
