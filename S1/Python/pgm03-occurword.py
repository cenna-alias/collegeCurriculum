# Count the occurrences of each word in a line of text. 

text = input("Enter the string: ")
words = text.split()

word_count = {}
for word in words:
    word_count[word] = word_count.get(word, 0) + 1

print(word_count)
