#!/bin/bash

file="movies.txt"

while true
do
    echo "-----------------------------"
    echo "1. Search for a movie name"
    echo "2. Count occurrences of a movie name"
    echo "3. Find movies starting/ending with a word"
    echo "4. Display only the first match"
    echo "5. Count total movies (words)"
    echo "6. Replace a movie name"
    echo "7. Exit"
    echo "-----------------------------"

    echo "Enter your choice:"
    read ch

    case $ch in
        1)
            echo "Enter movie name to search:"
            read movie
            grep -i "$movie" "$file"
            ;;

        2)
            echo "Enter movie name to count:"
            read movie
            count=$(grep -io "$movie" "$file" | wc -l)
            echo "Occurrences: $count"
            ;;

        3)
            echo "1. Movies starting with word"
            echo "2. Movies ending with word"
            read opt

            if [ $opt -eq 1 ]
            then
                echo "Enter starting word:"
                read word
                grep -i "^$word" "$file"
            else
                echo "Enter ending word:"
                read word
                grep -i "$word$" "$file"
            fi
            ;;

        4)
            echo "Enter movie name:"
            read movie
            grep -im 1 "$movie" "$file"
            ;;

        5)
            total=$(wc -w < "$file")
            echo "Total movies (words): $total"
            ;;

        6)
            echo "Enter movie name to replace:"
            read old
            echo "Enter new movie name:"
            read new
            sed -i "s/$old/$new/g" "$file"
            echo "Replacement done."
            ;;

        7)
            echo "Exiting..."
            break
            ;;

        *)
            echo "Invalid choice!"
            ;;
    esac
done