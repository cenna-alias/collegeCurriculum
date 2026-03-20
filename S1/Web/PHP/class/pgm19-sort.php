<?php
$students = ["Alice", "Bob", "Charlie", "Diana", "Eve"];
echo "<h3>Original Array:</h3>";
print_r($students);
echo "<br><br>";
asort($students);
echo "<h3>Array Sorted in Ascending Order:</h3>";
print_r($students);
echo "<br><br>";
arsort($students);
echo "<h3>Array Sorted in Descending Order:</h3>";
print_r($students);
?>
