drop database if exists testdb3;
create database testdb3;
use testdb3;

create table test3_table(
user_id int,
user_name varchar(255),
password varchar(255));

insert into test3_table values(1, "taro", "123");
insert into test3_table values(2, "jiro", "456");
insert into test3_table values(3, "hanako", "789");
insert into test3_table values(4, "saki", "987");
insert into test3_table values(5, "suzuki", "654");