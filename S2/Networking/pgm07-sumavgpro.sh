#!/bin/bash
echo "Enter first number:"
read num1
echo "Enter second number:"
read num2
echo "Enter third number:"
read num3
echo "Enter fourth number:"
read num4
sum=$((num1 + num2 + num3 + num4))
average=$((sum / 4))
product=$((num1 * num2 * num3 * num4))
echo "Sum: $sum"
echo "Average: $average"
echo "Product: $product"