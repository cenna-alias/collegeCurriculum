<!DOCTYPE html>
<html>
<head>
<title>Employee Records</title>
</head>
<body>
<h2>Employee List</h2>
<?php
$conn = new mysqli("localhost", "root", "", "Employee");
$result = $conn->query("SELECT * FROM employees");
echo "<table border='1' cellpadding='10'>";
echo
"<tr><th>ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>";
while ($row = $result->fetch_assoc()) {
echo "<tr>";
echo "<td>".$row['emp_id']."</td>";
echo "<td>".$row['emp_name']."</td>";
echo "<td>".$row['department']."</td>";
echo "<td>".$row['salary']."</td>";
echo "</tr>";
}
echo "</table>";
?>
</body>
</html>