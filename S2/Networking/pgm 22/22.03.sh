#  Make a file read only for all users.

#!/bin/bash
echo "Enter the filename to make read-only:"
read filename
chmod 444 "$filename"
echo "$filename is now read-only for everyone."