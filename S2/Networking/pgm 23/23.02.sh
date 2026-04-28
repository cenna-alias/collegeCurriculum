# Write a shell script which count the occurrences of a particular word in a file.

#!/bin/bash
echo "Enter the word to count:"
read word
echo "Enter the filename:"
read filename
grep -o "$word" "$filename" | wc -l