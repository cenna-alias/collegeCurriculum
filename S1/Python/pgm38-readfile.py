file_path = "myfile.txt"   

lines_list = []

with open(file_path, "r") as file:
    for line in file:
        lines_list.append(line.strip())

print("Contents of file as list:")
print(lines_list)