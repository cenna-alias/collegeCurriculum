#!/bin/bash
OUTPUT="capture.pcap"
if [ -z "$1" ]; then
 echo "Usage: $0 <hostname>"
 exit 1
fi
HOST=$1
IP=$(dig +short $HOST | head -n 1)
if [ -z "$IP" ]; then
 echo "Could not resolve hostname"
 exit 1
fi
echo "Capturing traffic for $HOST ($IP)..."
sudo tcpdump -i any host $IP and \( port 80 or port 443 \) -w $OUTPUT
echo "Capture saved to $OUTPUT"