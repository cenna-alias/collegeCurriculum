# Shell Script to Count the Total Number of Words in a File.

#!/bin/bash
echo "Enter the filename:"
read filename
wc -w < "$filename"