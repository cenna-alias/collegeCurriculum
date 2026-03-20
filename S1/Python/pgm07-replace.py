# Replace all occurrences of first character in a string with '$', except the first character
text = input("Enter the string: ")

first_char = text[0]
# Replace all occurrences of first_char in the rest of the string
result = first_char + text[1:].replace(first_char, '$')

print("Modified string:", result)
