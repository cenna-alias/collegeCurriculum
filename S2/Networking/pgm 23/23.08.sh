# Write a shell script to display lines that do not contain a specific word using grep.

#!/bin/bash
echo "Enter the word to exclude:"
read word
echo "Enter the filename:"
read filename
grep -v "$word" "$filename"