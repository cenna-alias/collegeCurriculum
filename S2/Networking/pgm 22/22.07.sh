# Revoke all permissions from a file.

#!/bin/bash
echo "Enter the filename to remove all permissions:"
read filename
chmod 000 "$filename"
echo "All permissions removed from $filename."