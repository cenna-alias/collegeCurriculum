echo "Enter the filename:"
	read filename
if [ ! -e "$filename" ]; then
	echo "File does not exist."
	exit 1
fi
while true
do
	echo "File exists.Choose an operation:"
	echo "1.Copy"
	echo "2.Edit"
	echo "3.Rename"
	echo "4.Delete"
	echo "5.Exit"
	read -p "Enter your choice:" choice
	case $choice in
		1)
			read -p "Enter destination filename:" dest
			cp "$filename" "$dest"
			echo "File copied successfully"
			;;
		2)
			gedit "$filename" &
			;;
		3)
			read -p "Enter new filename:" newname
			mv "$filename" "$newname"
			echo "File renamed successfully"
			;;
		4)
			rm "$filename"
			echo "File deleted successfully"
			;;
		5)
			echo "Exiting program"
			exit 0
			;;
		*)
			echo "Invalid choice"
			;;
	esac
done