delete from Course;
delete from Subject;
delete from Student;
delete from Teacher;

insert into Subject(id, name, departmentName)
            values ('0', 'Anatomy', 'Science');
insert into Subject
            values ('1', 'Biology', 'Science');
insert into Subject
            values ('2', 'Chemistry', 'Science');
insert into Subject
            values ('3', 'Physics', 'Science');
insert into Subject
            values ('4', 'Geometry', 'Mathematics');
insert into Subject
            values ('5', 'Algebra2', 'Mathematics');
insert into Subject
            values ('6', 'Precalculus', 'Mathematics');
insert into Subject
            values ('7', 'Calculus', 'Mathematics');
            
insert into Teacher
            values ('0', 'Maria Espinoza', 'Science');
insert into Teacher
            values ('1', 'Jeff Davis', 'Science');
insert into Teacher
            values ('2', 'Tom Smith', 'Science');
insert into Teacher
            values ('3', 'Bob Wahlberg', 'Science');
insert into Teacher
            values ('4', 'Jessica White', 'Mathematics');
insert into Teacher
            values ('5', 'Dave Anderson', 'Mathematics');
insert into Teacher
            values ('6', 'Suzie Smith', 'Mathematics');
insert into Teacher
            values ('7', 'Jim Halpert', 'Mathematics');