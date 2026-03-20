<!DOCTYPE html>
<html>
<head>
<title>Insert Employee</title>
</head>
<body>
<h2>Add Employee</h2>
<form method="post" action="">
Name: <input type="text" name="emp_name"
required><br><br>
Department: <input type="text" name="department"
required><br><br>
Salary: <input type="text" name="salary"
required><br><br>
<input type="submit" value="Save">
</form>
<?php
$conn = new mysqli("localhost", "root", "", "Employee");
if ($_SERVER["REQUEST_METHOD"] == "POST") {
$name = $_POST['emp_name'];
$dept = $_POST['department'];
$salary = $_POST['salary'];
$sql = "INSERT INTO employees (emp_name,
department, salary)
VALUES ('$name', '$dept', '$salary')";
if ($conn->query($sql)) {
echo "<p> Employee Added Successfully!</p>";
} else {
echo "<p> Error: " . $conn->error . "</p>";
}
}
?>
</body>
</html>