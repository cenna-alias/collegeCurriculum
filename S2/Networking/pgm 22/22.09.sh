# Allow only the owner to execute the file.

#!/bin/bash
echo "Enter the filename:"
read filename
chmod 744 "$filename"
echo "Owner can read, write, and execute; others can only read $filename."