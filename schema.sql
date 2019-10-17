create table if not exists Course(
  id varchar(3) primary key,
  name varchar(25) not null,
  subjectName varchar(25) not null,
  teacherName varchar(25) not null,
  period int not null,
 );
 
 create table if not exists Subject(
   id varchar(3) primary key,
   name varchar(25) not null,
   departmentName varchar(25) not null
 );
 
 create table if not exists Student(
   id varchar(3) primary key,
   name varchar(25) not null,
   grade int not null
 );
 
 create table if not exists Teacher(
   id varchar(3) primary key,
   name varchar(25) not null,
   departmentName varchar(25) not null
 );
 
 
  
  