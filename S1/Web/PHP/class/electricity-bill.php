<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $units = (float) $_POST['units'];
    $rate  = (float) $_POST['rate'];

    $total = $units * $rate;

    echo "<h2>Electricity Bill</h2>";
    echo "Units Consumed: $units kWh<br>";
    echo "Tariff Rate: ₹$rate per kWh<br>";
    echo "Total Cost: ₹" . number_format($total, 2);    //  formats the total cost with 2 decimal places:  
}
?>