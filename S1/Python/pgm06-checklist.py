# Enter 2 lists of integers. Check (a) Whether list are of same length (b) whether list sums
# to same value (c) whether any value occur in both 

# Input two lists
list1 = [int(x) for x in input("Enter first list of integers: ").split()]
list2 = [int(x) for x in input("Enter second list of integers: ").split()]

# a. Check if lists are of same length
if len(list1) == len(list2):
    print("Lists are of same length")
else:
    print("Lists are of different length")

# b. Check if lists have same sum
if sum(list1) == sum(list2):
    print("Lists have same sum:", sum(list1))
else:
    print("Lists have different sums. List1:", sum(list1), "List2:", sum(list2))

# c. Check if lists have common elements
common_elements = set(list1).intersection(list2)
if common_elements:
    print("Common elements:", common_elements)
else:
    print("No common elements")
