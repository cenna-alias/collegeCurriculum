<!DOCTYPE html>
<html>
<head>
<title>Update Student</title>
</head>
<body>
<h2>Update Student Information</h2>
<form method="POST" action="">
<label>Student ID:</label>
<input type="number" name="id" required><br><br>
<label>New Name:</label>
<input type="text" name="name" required><br><br>
<label>New Email:</label>
<input type="email" name="email" required><br><br>
<input type="submit" name="update" value="Update">
</form>
<?php
if (isset($_POST['update'])) {
$conn = mysqli_connect("localhost", "root", "",
"online_exam");
if (!$conn) {
die("Connection failed: " .
mysqli_connect_error());
}
$id = $_POST['id'];
$name = $_POST['name'];
$email = $_POST['email'];
$sql = "UPDATE students SET name='$name',
email='$email' WHERE id=$id";
if (mysqli_query($conn, $sql)) {
echo "<p style='color:green;'>Record updated
successfully!</p>";
} else {
echo "<p style='color:red;'>Error updating
record: " . mysqli_error($conn) . "</p>";
}
mysqli_close($conn);
}
?>
</body>
</html>