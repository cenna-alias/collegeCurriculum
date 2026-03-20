# Store a list of first names. Count the occurrences of ‘a’ within the list

names = input("Enter first names: ").split()

count = 0
for name in names:
    count += name.count('a')  

print("Occurrence of 'a' in the list is:", count)
