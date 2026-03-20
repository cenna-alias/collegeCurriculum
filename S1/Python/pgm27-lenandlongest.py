# Accept a list of words and return length of longest word
words = input("Enter words separated by space: ").split()

length = len(max(words, key=len))
print("Length of longest word:", length)
