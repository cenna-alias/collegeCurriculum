# Write a shell script to find and display lines starting with a specific word.

#!/bin/bash
echo "Enter the word to search at the beginning of a line:"
read word
echo "Enter the filename:"
read filename
grep "^$word" "$filename"
