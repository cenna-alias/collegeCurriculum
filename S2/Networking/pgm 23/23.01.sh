# Write a shell script which finds a particular word in a file.

#!/bin/bash
echo "Enter the word to search:"
read word
echo "Enter the filename:"
read filename
grep "$word" "$filename"