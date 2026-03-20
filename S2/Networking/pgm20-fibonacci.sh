#!/bin/bash
fibonacci() {
	n=$1
	a=0
	b=1
	echo "Fibonacci series upto $n terms:"
	
	for(( i=0; i<n; i++ ))
	do
		echo -n "$a "
		temp=$((a + b))
		a=$b
		b=$temp
	done
	echo
}

read -p "Enter the number of terms: " num
fibonacci $num