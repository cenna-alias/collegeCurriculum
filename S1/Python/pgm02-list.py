# List comprehensions:
# (a) Generate positive list of numbers from a given list of integers
# (b) Square of N numbers
# (c) Form a list of vowels selected from a given word
# (d) List ordinal value of each element of a word (Hint: use ord() to get ordinal values)

numbers = [1, 2, -34, 34, 56, 100, -35]
positive_list = [i for i in numbers if i > 0]
print(positive_list)

numbers = [1, 2, 3, 4, 5, 6]
square_list = [i * i for i in numbers]
print(square_list)

text = "Master of Computer Applications"
vowels = "aeiouAEIOU"
vowel_list = [i for i in text if i in vowels]
print(vowel_list)

word = "MCA"
ordinal_list = [ord(i) for i in word]
print(ordinal_list)
