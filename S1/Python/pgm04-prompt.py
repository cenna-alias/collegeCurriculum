# Prompt the user for a list of integers. For all values greater than 100, store ‘over’ instead.

integers = input("Enter integers: ").split()

new_list = []
for num in integers:
    if int(num) > 100:
        new_list.append('over')  
    else:
        new_list.append(int(num))  

print(new_list)
