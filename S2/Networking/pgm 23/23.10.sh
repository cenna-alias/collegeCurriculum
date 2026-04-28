# Write a shell script to count the number of empty lines in a file using grep.

#!/bin/bash
echo "Enter the filename:"
read filename
grep -c "^$" "$filename"