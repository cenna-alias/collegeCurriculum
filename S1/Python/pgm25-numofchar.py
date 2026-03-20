# Count the number of characters (character frequency) in a string
s = input("Enter a string: ")

freq = {}
for char in s:
    freq[char] = freq.get(char, 0) + 1

print("Character frequency:", freq)
