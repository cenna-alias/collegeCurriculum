<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "sample";
$conn = new mysqli($servername, $username, $password,
$dbname);
if ($conn->connect_error) {
die("Connection failed: " . $conn->connect_error);
}
$item_name = $_POST['item_name'];
$price = $_POST['price'];
$sql = "INSERT INTO products (item_name, price)
VALUES ('$item_name', '$price')";
if ($conn->query($sql) === TRUE) {
echo " Record inserted successfully!";
} else {
echo " Error: " . $conn->error;
}
$conn->close();
?>