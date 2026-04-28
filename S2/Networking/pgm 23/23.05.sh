# Write a shell script that finds lines that contain only numbers.

#!/bin/bash
echo "Enter the filename:"
read filename
grep "^[0-9]\+$" "$filename"