# Program to find the factorial of a number using function
def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    return fact

n = int(input("Enter a number: "))
print("Factorial:", factorial(n))
