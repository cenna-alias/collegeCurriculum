# Shell script to Find and Print Duplicate Lines in a File.

#!/bin/bash
echo "Enter the filename:"
read filename
sort "$filename" | uniq -d