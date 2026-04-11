<!DOCTYPE html>
<html>
<body>
<h2>Add Fruit</h2>
<form method="post">
Fruit Name: <input type="text" name="fruit_name"
required>
Price: <input type="text" name="price" required>
<input type="submit" name="insert" value="Save">
</form>
<hr>
<?php
$conn = new mysqli("localhost", "root", "", "Fruits");
if (isset($_POST['insert'])) {
$name = $_POST['fruit_name'];
$price = $_POST['price'];
$conn->query("INSERT INTO fruitlist(fruit_name, price)
VALUES('$name', '$price')");
echo "Fruit Added!<br><br>";
}
if (isset($_GET['delete'])) {
$id = $_GET['delete'];
$conn->query("DELETE FROM fruitlist WHERE fruit_id=$id");
echo "Fruit Deleted!<br><br>";
}
?>
<h3>Fruit List</h3>
<table border="1" cellpadding="10">
<tr>
<th>ID</th>
<th>Fruit Name</th>
<th>Price</th>
<th>Delete</th>
</tr>
<?php
$result = $conn->query("SELECT * FROM fruitlist");
while ($row = $result->fetch_assoc()) {
echo "<tr>
<td>{$row['fruit_id']}</td>
<td>{$row['fruit_name']}</td>
<td>{$row['price']}</td>
<td><a
href='fruits.php?delete={$row['fruit_id']}'>Delete</a></td>
</tr>";
}
echo "</table>";
$conn->close();
?>
</body>
</html>