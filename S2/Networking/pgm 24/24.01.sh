# Shell Script to Display Only the First Match of a Word.

#!/bin/bash
echo "Enter the filename:"
read filename
echo "Enter the word to search:"
read word
grep -m 1 "$word" "$filename"