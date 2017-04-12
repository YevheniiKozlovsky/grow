create user 'drivers'@'localhost' identified by 'drivers';
grant usage on *.* to drivers@localhost identified by 'drivers';
drop database if exists drivers;
create database if not exists drivers;
grant all privileges on *.* to 'drivers'@'localhost';

use `drivers`;

#--deleting all tables------------------------------------------------------
DROP TABLE IF EXISTS `Request`;
DROP TABLE IF EXISTS `Trip`;
DROP TABLE IF EXISTS `Report`;
DROP TABLE IF EXISTS `Car`;
DROP TABLE IF EXISTS `CarStatus`;
DROP TABLE IF EXISTS`TripStatus`;
DROP TABLE IF EXISTS `User`;
DROP TABLE IF EXISTS `Role`;

#--create table ROLE----------------------------------------------------------
CREATE TABLE `Role` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL UNIQUE
);

#--create table User----------------------------------------------------------
CREATE TABLE `User` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	firstName VARCHAR(100) NOT NULL,
	lastName VARCHAR(100) NOT NULL,
	password VARCHAR(255) NOT NULL,
	email VARCHAR(100) NOT NULL UNIQUE,
	activated BOOLEAN DEFAULT false,
	activatedSuperuser BOOLEAN DEFAULT false,
	activateHash VARCHAR(100),
	registrationDate DATE NOT NULL,
	phone VARCHAR(20),
	photo VARCHAR(255),
	id_role INT NOT NULL,
	CONSTRAINT fk_id_role
		FOREIGN KEY (id_role)
		REFERENCES Role(id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

#--create table Car_status----------------------------------------------------------
CREATE TABLE `CarStatus` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL UNIQUE
);

#--create table Trip_status----------------------------------------------------------
CREATE TABLE `TripStatus` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL UNIQUE
);

#--create table Car----------------------------------------------------------
CREATE TABLE `Car` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	carNumber VARCHAR(20) NOT NULL UNIQUE,
	power INT NOT NULL,
	placeNumber SMALLINT NOT NULL,
	color VARCHAR(50) NOT NULL,
	photo VARCHAR(255),
	id_car_status INT NOT NULL,
	CONSTRAINT fk_car_status
		FOREIGN KEY (id_car_status)
		REFERENCES CarStatus(id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

#--create table Report----------------------------------------------------------
CREATE TABLE `Report` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	date DATE NOT NULL,
	description LONG VARCHAR,
	id_reporter INT NOT NULL,
	id_car_status INT NOT NULL,
	id_trip INT NOT NULL UNIQUE,
	CONSTRAINT fk_user
		FOREIGN KEY (id_reporter)
		REFERENCES User(id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_car_status_report
		FOREIGN KEY (id_car_status)
		REFERENCES CarStatus (id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

#--create table Trip----------------------------------------------------------
CREATE TABLE `Trip` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	number INT NOT NULL UNIQUE,
	startPoint VARCHAR(60) NOT NULL,
	endPoint VARCHAR(60) NOT NULL,
	date DATE NOT NULL,
	startDate DATE NOT NULL,
	endDate TIME NOT NULL,
	id_car INT,
	id_trip_status INT NOT NULL,
	id_creater INT  NOT NULL,
	id_driver INT,
	id_report INT,
	CONSTRAINT fk_car
		FOREIGN KEY (id_car)
		REFERENCES Car(id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_trip_status
		FOREIGN KEY (id_trip_status)
		REFERENCES TripStatus(id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_creater
		FOREIGN KEY (id_creater)
		REFERENCES  User (id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_report
		FOREIGN KEY (id_report)
		REFERENCES Report(id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_driver
		FOREIGN KEY (id_driver)
		REFERENCES User(id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

#--create table Request----------------------------------------------------------
CREATE TABLE `Request` (
	id INT PRIMARY KEY AUTO_INCREMENT,
	response BOOLEAN NOT NULL DEFAULT false,
	id_account INT NOT NULL,
	id_request_car INT NOT NULL,
	id_trip INT NOT NULL,
	id_respondent INT,
	CONSTRAINT fk_account
		FOREIGN KEY (id_account)
		REFERENCES User (id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_request_car
		FOREIGN KEY (id_request_car)
		REFERENCES Car (id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_trip
		FOREIGN KEY (id_trip)
		REFERENCES Trip (id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT fk_respondent
		FOREIGN KEY (id_respondent)
		REFERENCES User (id)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);