# Print colors from list1 not contained in list2
list1 = ["Red", "Green", "Blue", "White"]
list2 = ["Green", "White"]

result = [color for color in list1 if color not in list2]
print("Colors not in list2:", result)
