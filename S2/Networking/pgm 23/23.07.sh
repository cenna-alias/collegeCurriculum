# Write a shell script to perform a case-insensitive search using grep.

#!/bin/bash
echo "Enter the filename:"
read filename
echo "Enter the word to search (case-insensitive):"
read word
grep -i "$word" "$filename"