# Set a file as read only for others.

#!/bin/bash
echo "Enter the filename:"
read filename
chmod 644 "$filename"
echo "Owner can read/write others can only read $filename."