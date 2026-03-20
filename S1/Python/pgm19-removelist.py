# Remove all even numbers from a list of integers
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]

result = [n for n in nums if n % 2 != 0]
print("List after removing even numbers:", result)
