#!/bin/bash
names=("Ali" "Melvi" "Govind")
echo "Number of names: ${#names[@]}"
echo "Name at index 2: ${names[2]}"
echo "List of names:"
for name in "${names[@]}"; do
	echo $name
done