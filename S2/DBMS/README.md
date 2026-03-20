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
