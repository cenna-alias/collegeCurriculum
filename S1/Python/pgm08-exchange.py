# Exchange first and last characters of a string
text = input("Enter string: ")

if len(text) > 1:
    result = text[-1] + text[1:-1] + text[0]
else:
    result = text  # if only one character, keep it as is

print("Modified string:", result)
