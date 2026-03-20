# DBMS Lab Record

## Experiment 1: DDL Statements

### Aim:

Execute DDL Statements

### Program:

```sql
CREATE DATABASE cenna;
USE cenna;

CREATE TABLE student(
    RollNo INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    course VARCHAR(100),
    year INT
);

ALTER TABLE student ADD marks INT;

INSERT INTO student VALUES
(101,'Aparna',21,'MCA',2,80),
(102,'Gopika',21,'MCA',2,81),
(103,'Vishnupriya',21,'MCA',2,80),
(104,'Ashli',22,'MCA',2,81),
(105,'Aiswarya',22,'MCA',2,80);

SELECT * FROM student;

TRUNCATE TABLE student;

DROP TABLE student;
```

---

## Experiment 2: DML Statements

### Aim:

Execute SELECT, INSERT, UPDATE, DELETE

### Program:

```sql
CREATE TABLE Department(
    Dept_Id INT PRIMARY KEY,
    Dept_Name VARCHAR(50),
    Dept_Head VARCHAR(50)
);

CREATE TABLE Employee(
    Emp_Id INT PRIMARY KEY,
    Emp_Name VARCHAR(50),
    Dept_Id INT,
    Salary FLOAT,
    FOREIGN KEY (Dept_Id) REFERENCES Department(Dept_Id)
);

INSERT INTO Department VALUES
(1,'Dept_A','Dept_HeadA'),
(2,'Dept_B','Dept_HeadB'),
(3,'Dept_C','Dept_HeadC'),
(4,'Dept_D','Dept_HeadD');

INSERT INTO Employee VALUES
(101,'EmpA',1,50000),
(102,'EmpB',2,35000),
(103,'EmpC',3,70000),
(104,'EmpD',4,50000);

SELECT * FROM Employee;

UPDATE Employee
SET Salary = 75000.25
WHERE Emp_Id = 104;

DELETE FROM Employee
WHERE Emp_Id = 103;
```

---

## Experiment 3: DCL Statements

### Aim:

Create a table and execute DCL statements

### Program:

```sql
CREATE USER 'xyz'@'localhost' IDENTIFIED BY 'a1234';

GRANT ALL PRIVILEGES ON Employee TO 'xyz'@'localhost';

REVOKE ALL PRIVILEGES ON Employee FROM 'xyz'@'localhost';
```

---

## Experiment 4: TCL Statements

### Aim:

Execute TCL Statements

### Program:

```sql
START TRANSACTION;

SAVEPOINT a;

ROLLBACK TO a;

COMMIT;
```

---

## Experiment 5: SQL Clauses

### Aim:

Accessing database using clauses

### Program:

```sql
SELECT department, SUM(salary_in_lacs) AS salary_sum
FROM Employee
GROUP BY department;

SELECT department, SUM(salary_in_lacs) AS salary_sum
FROM Employee
GROUP BY department
HAVING SUM(salary_in_lacs) >= 20;

SELECT DISTINCT department FROM Employee;

SELECT COUNT(salary_in_lacs) FROM Employee;
```

---

## Experiment 6: Views

### Aim:

Create a view

### Program:

```sql
CREATE VIEW newyorkstaff AS
SELECT * FROM salesman
WHERE city = 'New York';
```

---

## Experiment 7: Subquery

### Aim:

Subquery in MySQL

### Program:

```sql
SELECT * FROM Employees
WHERE income = (SELECT MAX(income) FROM Employees);
```

---

## Experiment 8: Joins

### Aim:

Use join queries

### Program:

```sql
SELECT B.bname, S.sname
FROM Boats B
INNER JOIN Reserves R ON B.bid = R.bid
INNER JOIN Sailors S ON S.sid = R.sid;
```

---

## Experiment 9: PL/SQL Procedure

### Aim:

Display all fields from a table

### Program:

```sql
DELIMITER //

CREATE PROCEDURE display()
BEGIN
    SELECT * FROM Student;
END //

DELIMITER ;
```

---

## Experiment 10: PL/SQL Procedure

### Aim:

Add two numbers

### Program:

```sql
DELIMITER //

CREATE PROCEDURE sum_proc(IN a INT, IN b INT)
BEGIN
    DECLARE c INT;
    SET c = a + b;
    SELECT c AS Result;
END //

DELIMITER ;
```

---

## Experiment 11: PL/SQL Procedure

### Aim:

Check whether a number is odd or even

### Program:

```sql
DELIMITER //

CREATE PROCEDURE CheckOddOrEven(IN input_number INT)
BEGIN
    IF MOD(input_number,2)=0 THEN
        SELECT 'Even' AS result;
    ELSE
        SELECT 'Odd' AS result;
    END IF;
END //

DELIMITER ;
```

---

## Experiment 12: PL/SQL Procedure

### Aim:

Find factorial of a number

### Program:

```sql
DELIMITER //

CREATE PROCEDURE Factorial(IN a INT)
BEGIN
    DECLARE f INT DEFAULT 1;
    WHILE a > 0 DO
        SET f = f * a;
        SET a = a - 1;
    END WHILE;
    SELECT f AS Factorial;
END //

DELIMITER ;
```

---

## Experiment 13: PL/SQL Procedure

### Aim:

Find maximum of three values

### Program:

```sql
DELIMITER //

CREATE PROCEDURE MaxOfThree(IN a INT, IN b INT, IN c INT)
BEGIN
    DECLARE largest INT;
    SET largest = a;

    IF b > largest THEN
        SET largest = b;
    ELSEIF c > largest THEN
        SET largest = c;
    END IF;

    SELECT largest AS Maximum;
END //

DELIMITER ;
```

---

## Experiment 14: PL/SQL Procedure

### Aim:

Find the sum of digits

### Program:

```sql
DELIMITER //

CREATE PROCEDURE SumOfDigits(IN a INT)
BEGIN
    DECLARE digit INT;
    DECLARE sum_val INT DEFAULT 0;

    WHILE a > 0 DO
        SET digit = a % 10;
        SET sum_val = sum_val + digit;
        SET a = FLOOR(a / 10);
    END WHILE;

    SELECT sum_val AS SumOfDigits;
END //

DELIMITER ;
```

---

## Experiment 15: SQL Trigger

### Aim:

Execution of trigger

### Program:

```sql
CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2)
);

CREATE TABLE audit_log(
    log_id INT PRIMARY KEY AUTO_INCREMENT,
    action VARCHAR(255),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //

CREATE TRIGGER after_employee_insert
AFTER INSERT ON Employees
FOR EACH ROW
BEGIN
    INSERT INTO audit_log(action, timestamp)
    VALUES ('New employee inserted', NOW());
END //

DELIMITER ;
```

---

## Experiment 16: Trigger (BEFORE UPDATE)

### Aim:

Calculate total, percentage and grade

### Program:

```sql
CREATE TABLE std1(
    student_id INT PRIMARY KEY,
    Name VARCHAR(20),
    sub1 INT, sub2 INT, sub3 INT, sub4 INT, sub5 INT,
    total INT,
    per_marks INT,
    grade VARCHAR(20)
);

DELIMITER //

CREATE TRIGGER std_before_update
BEFORE UPDATE ON std1
FOR EACH ROW
BEGIN
    DECLARE total_marks INT;
    DECLARE per INT;
    DECLARE grade_val VARCHAR(20);

    SET total_marks = NEW.sub1 + NEW.sub2 + NEW.sub3 + NEW.sub4 + NEW.sub5;
    SET per = total_marks / 5;

    IF per >= 90 THEN
        SET grade_val = 'Excellent';
    ELSEIF per >= 75 THEN
        SET grade_val = 'Very good';
    ELSEIF per >= 60 THEN
        SET grade_val = 'Good';
    ELSEIF per >= 40 THEN
        SET grade_val = 'Average';
    ELSE
        SET grade_val = 'Not promoted';
    END IF;

    SET NEW.total = total_marks;
    SET NEW.per_marks = per;
    SET NEW.grade = grade_val;
END //

DELIMITER ;
```

---

## Experiment 17: Trigger (AFTER UPDATE)

### Aim:

Log updates in table

### Program:

```sql
CREATE TABLE students(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45),
    class INT,
    email_id VARCHAR(65)
);

CREATE TABLE student_log(
    user VARCHAR(45),
    descriptions VARCHAR(100)
);

DELIMITER //

CREATE TRIGGER after_update_students
AFTER UPDATE ON students
FOR EACH ROW
BEGIN
    INSERT INTO student_log
    VALUES (USER(), CONCAT('Updated ', OLD.name, ' from class ', OLD.class, ' to ', NEW.class));
END //

DELIMITER ;
```

---

## Experiment 18: Cursor

### Aim:

Find average salary using cursor

### Program:

```sql
DELIMITER //

CREATE PROCEDURE calculate_avg_salary()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE sal INT;
    DECLARE total INT DEFAULT 0;
    DECLARE count_val INT DEFAULT 0;

    DECLARE cur CURSOR FOR SELECT salary FROM Employees;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO sal;
        IF done THEN
            LEAVE read_loop;
        END IF;

        SET total = total + sal;
        SET count_val = count_val + 1;
    END LOOP;

    CLOSE cur;

    SELECT total / count_val AS AverageSalary;
END //

DELIMITER ;
```

---

## Experiment 19: Cursor

### Aim:

List names using cursor

### Program:

```sql
DELIMITER //

CREATE PROCEDURE list_names(INOUT name_list VARCHAR(4000))
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE s_name VARCHAR(100);

    DECLARE cur CURSOR FOR SELECT Name FROM Student;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO s_name;
        IF done THEN
            LEAVE read_loop;
        END IF;

        SET name_list = CONCAT(s_name, ';', name_list);
    END LOOP;

    CLOSE cur;
END //

DELIMITER ;
```

---

## Experiment 20: MongoDB

### Aim:

Create database and collection

### Program:

```javascript
use test

db.createCollection("Student")

db.student.insert({rollno:101,name:"Alex",Branch:"MCA"})
db.student.insert({rollno:102,name:"Maya",Branch:"MBA"})
db.student.insert({rollno:103,name:"Niya",Branch:"BCA"})

db.student.find().pretty()
```

---

## Experiment 21: NoSQL Database

### Aim:

Employee Management

### Program:

```javascript
use Employee

db.createCollection("EMPL")

db.EMPL.insertMany([
{"Empno":1,"Name":"John Doe","Salary":60000,"Role":"Manager"},
{"Empno":2,"Name":"Alice Smith","Salary":50000,"Role":"Developer"},
{"Empno":3,"Name":"Bob","Salary":70000,"Role":"System Analyst"}
])

db.EMPL.find().pretty()

db.EMPL.find({"Role":"Manager"})

db.EMPL.updateOne({"Name":"Alice Smith"},{$set:{"Salary":55000}})
```

---

## Experiment 22: CRUD Operations

### Aim:

Product Catalog

### Program:

```javascript
use productCatalog

db.createCollection("Products")

db.Products.insertMany([
{"ProductID":1,"ProductName":"Laptop","Price":1000,"Quantity":20},
{"ProductID":2,"ProductName":"Smartphone","Price":500,"Quantity":30},
{"ProductID":3,"ProductName":"Washing Machine","Price":50000,"Quantity":50}
])

db.Products.find().pretty()

db.Products.updateOne({"ProductName":"Laptop"},{$inc:{"Quantity":10}})

db.Products.deleteOne({"ProductName":"Smartphone"})
```

---

## Experiment 23: Aggregate Functions

### Aim:

Usage of aggregate functions

### Program:

```javascript
use Students

db.Students.aggregate([
{$group:{_id:"$sec",total:{$sum:1},max_age:{$max:"$age"}}}
])

db.Students.aggregate([
{$match:{age:{$gt:17}}}
])

db.Students.count()

db.Students.distinct("Name")
```

---

## Experiment 24: Users and Roles

### Aim:

Create users and roles

### Program:

```javascript
use Employee

db.createUser({
user:"admin",
pwd:"admin123",
roles:["readWrite","dbAdmin"]
})

db.createUser({
user:"developer",
pwd:"dev123",
roles:["readWrite"]
})

show users
```
