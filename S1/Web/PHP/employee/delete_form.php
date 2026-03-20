<!DOCTYPE html>
<html>
<head>
<title>Delete Employee</title>
</head>
<body>
<h2>Delete Employee Record</h2>
<form action="" method="post">
Enter Employee ID to Delete:
<input type="number" name="emp_id" required>
<input type="submit" value="Delete">
</form>
<?php
$conn = new mysqli("localhost", "root", "", "Employee");
if ($_SERVER["REQUEST_METHOD"] == "POST") {
$id = $_POST['emp_id'];
$sql = "DELETE FROM employees WHERE emp_id = $id";
if ($conn->query($sql)) {
if ($conn->affected_rows > 0) {
echo "<p> Record Deleted Successfully!</p>";
} else {
echo "<p> No record found with ID $id</p>";
}
} else {
echo "Error: " . $conn->error;
}
}
$conn->close();
?>
</body>
</html>