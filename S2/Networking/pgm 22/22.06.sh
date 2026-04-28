# Grant full permissions for all users.

#!/bin/bash
echo "Enter the filename to grant full permissions:"
read filename
chmod 777 "$filename"
echo "Full permissions (rwxrwxrwx) granted to everyone for $filename."