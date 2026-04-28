# Shell script to display details of a process using user input.

#!/bin/bash
echo -n "Enter process name or PID (e.g., firefox, chrome, bash, or 1234): "
read process
if [ -z "$process" ]; then
 echo "No input provided. Exiting."
 exit 1
fi
ps aux | grep -w "$process" | grep -v "grep" || echo "No such process found: $process"