create database shop ; -- to create database--
use shop; -- to acess database --
create table customer -- to create table customer --
( customer_id int not null primary key,
name varchar (100) not null ,
email_id varchar (100) not null );


Insert into customer -- to insert into table customer --
values('101' , 'pooja' ,'pooja.12@gmail.com');
Insert into customer
values('102' , 'shubham' ,'shubham.12@gmail.com');
Insert into customer
values('103' , 'kundan' ,'kundan.12@gmail.com');
Insert into customer
values('104' , 'vinay' ,'vinay.12@gmail.com');
Insert into customer
values('105' , 'jack' ,'jack.12@gmail.com');

select * from customer ; -- to show all data from table customer --

create table orders -- to create table orders --
( order_id int not null  primary key ,
customer_id int not null ,
order_item varchar (100) ) ;

select  * from orders ; -- to show all data of table order

Insert into orders -- insert values in orders --
values ( '1001','101','fruits');
Insert into orders
values ( '1002','102','vegetables');
Insert into orders
values ( '1003','103','sweets');
Insert into orders
values ( '1004','104','Dairy product');
Insert into orders
values ( '1005','105','Cake');
Insert into orders
values ( '1006','106','grocery');

select * from customer where name = 'pooja' ; 

select * from customer ;

select * from orders ;

-- inner join --
select * from customer inner join orders on customer.customer_id =orders.customer_id where name = 'pooja' ; -- 1st method --
-- 2nd method --
select customer.customer_id ,customer.name , customer.email_id ,orders.order_id , orders.order_item from customer inner join orders on customer.customer_id =orders.customer_id where name = 'pooja' ;