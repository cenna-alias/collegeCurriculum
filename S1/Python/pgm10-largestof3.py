# Find the largest of three numbers.

# Using max() function

a = float(input("Enter 1st number:"))
b = float(input("Enter 2nd number:"))
c = float(input("Enter 3rd number:"))
print("Largest Number:",max(a,b,c))

# Using if-else

if a >= b and a >= c:
    largest = a
elif b >= a and b >= c:
    largest = b
else:
    largest = c
print("Largest Number:", largest)
