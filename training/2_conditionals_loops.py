"""
Real-Life Application: SIMPLE STUDENT MARKS PROGRAM (Beginner Level)
=========================================================================
Covers: all conditional statements and all looping statements.
"""

# ------------------------------------------------------------------
# Simple if
# ------------------------------------------------------------------
marks = 85

if marks > 80:
    print("Good marks!")

print()

# ------------------------------------------------------------------
# if-else
# ------------------------------------------------------------------
marks2 = 30

if marks2 >= 40:
    print("Result: Pass")
else:
    print("Result: Fail")

print()

# ------------------------------------------------------------------
# if-elif-else
# ------------------------------------------------------------------
marks3 = 75

if marks3 >= 90:
    print("Grade: A")
elif marks3 >= 75:
    print("Grade: B")
elif marks3 >= 60:
    print("Grade: C")
else:
    print("Grade: D")

print()

# ------------------------------------------------------------------
# Nested if
# ------------------------------------------------------------------
age = 20
has_id = True

if age >= 18:
    if has_id:
        print("Entry allowed")
    else:
        print("Entry denied, ID required")
else:
    print("Entry denied, underage")

print()

# ------------------------------------------------------------------
# for loop
# ------------------------------------------------------------------
print("Students in class:")
students = ["Aditi", "Rahul", "Meera"]
for name in students:
    print(name)

print()

# ------------------------------------------------------------------
# while loop
# ------------------------------------------------------------------
print("Counting 1 to 5:")
count = 1
while count <= 5:
    print(count)
    count = count + 1

print()

# ------------------------------------------------------------------
# for loop with break
# ------------------------------------------------------------------
print("Stop when we find Rahul:")
for name in students:
    if name == "Rahul":
        print("Found Rahul, stopping")
        break
    print(name)

print()

# ------------------------------------------------------------------
# for loop with continue
# ------------------------------------------------------------------
print("Print only even numbers from 1 to 10:")
for num in range(1, 11):
    if num % 2 != 0:
        continue
    print(num)

print()

# ------------------------------------------------------------------
# nested loop
# ------------------------------------------------------------------
print("Multiplication table (1 to 3):")
for i in range(1, 4):
    for j in range(1, 4):
        print(i, "x", j, "=", i * j)
    print()
