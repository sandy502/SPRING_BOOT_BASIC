create database Freecharge;
use Freecharge;
create table Interns
(
	id int,
    name varchar(100)
);

show databases;
show tables;
show columns from Interns;
desc Interns;


create table Pastries
(
name varchar(50),
quantity int
);
show tables;
desc Pastries;
-- This is how we do things in MySQL workbench
show tables;
show columns from Pastries;
insert into Pastries (name, quantity) values("Chocolate", 5);
insert into Pastries (name, quantity) values("orange", 5);
insert into Pastries (name, quantity) values("vanilla", 1);
insert into Pastries (name, quantity) values("strawberry", 9);
insert into Pastries (name, quantity) values("brownie", 7);
insert into Pastries (name, quantity) values("pineapple", 6);
insert into Pastries (name, quantity) values("mango", 3);
insert into Pastries (name, quantity) values("blueberry", 2);
select * from Pastries;
