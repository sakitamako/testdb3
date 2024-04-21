drop database if exists sampledb3;
create database sampledb3;
use sampledb3;

create table sample3_table(
No int,
name varchar(50),
age int,
password varchar(50));

insert into sample3_table values(1, "Yamada", 21, "xxx@yahoo.co.jp");
insert into sample3_table values(2, "Sato", 39, "yyy@google.com");
insert into sample3_table values(3, "Harada", 44, "zzz@yahoo.co.jp");