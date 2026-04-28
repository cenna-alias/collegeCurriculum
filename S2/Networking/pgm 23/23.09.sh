# Write a shell script to display the line numbers of matching words using grep.

#!/bin/bash
echo "Enter the filename:"
read filename
echo "Enter the word to search:"
read word
grep -n "$word" "$filename"