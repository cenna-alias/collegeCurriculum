source_file = "input.txt"
destination_file = "odd_lines.txt"

with open(source_file, "r") as sf, open(destination_file, "w") as df:
    for index, line in enumerate(sf, start=1):
        if index % 2 != 0:   
            df.write(line)

print("Odd lines copied successfully!")