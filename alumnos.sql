create database alumno;

use alumno;

create table alumno(
numeroControl int not null auto_increment primary key,
nombreAlumno varchar(50) not null,
apellidoPaterno varchar(50) not null,
apellidoMaterno varchar(50) not null,
carrera varchar(50) not null,
grupo varchar(50) not null
);

select * from alumno;