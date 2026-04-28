# Script to Count the Number of Running Instances of a Process.

#!/bin/bash
read -p "Enter process name or PID: " process
if [ -z "$process" ]; then
 echo "No input provided. Exiting."
 exit 1
fi
count=$(ps aux | grep -w "$process" | grep -v "grep" | wc -l)
if [ "$count" -eq 0 ]; then
 echo "No running instances of '$process' found."
else
 echo "Number of running instances of '$process': $count"
fi