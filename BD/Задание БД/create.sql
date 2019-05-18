create database ING;
go
use ING;
create table Company (Id_company Int, Name_comp varchar(100), Address_comp varchar(200), Tel_comp float , 
primary key(Id_company));
go
create table Customer (Id_cust Int, Id_company int, FIO_cust varchar(100),
 primary key(Id_cust),
foreign key(Id_company) references Company (Id_company));
go
create table Providers (Id_Provider Int, Name_Post varchar(100), Address_Post varchar(200),Tel_Post float , 
primary key(Id_Provider));  
go
create table Product (Id_prod Int, Name_prod varchar(100), Opt_Prise float, Rozn_Price float , Info_prod varchar(200), Id_Provider int, Amout_prod int,
primary key(Id_prod),
foreign key(Id_Provider) references Providers (Id_Provider));
go
create table Deal (Id_deal Int, Data_deal date, Id_prod Int, Id_cust Int, Amount_deal int, primary key(Id_deal),
 foreign key(Id_prod) references Product (Id_prod),
 foreign key(Id_cust) references Customer (Id_cust));
 go
