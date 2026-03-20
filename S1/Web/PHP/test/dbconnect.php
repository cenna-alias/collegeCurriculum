<?php
$servername = "localhost";
$username = "root"; // default username
$password = ""; // default password is empty
$dbname = "sampledb";
$conn = new mysqli($servername, $username,
$password, $dbname);
if ($conn->connect_error) {
die("Connection failed: " . $conn->connect_error);
}
echo " Database Connected Successfully!";
?>