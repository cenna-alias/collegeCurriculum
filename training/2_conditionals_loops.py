"""
Real-Life Application: STUDENT EXAM RESULT & ATTENDANCE ANALYZER
====================================================================
This program demonstrates:
  1. All Conditional Statements  (if, if-else, if-elif-else, nested if)
  2. All Looping Statements      (for, while, nested loop,
                                   break, continue, pass)
"""

# ------------------------------------------------------------------
# Sample real-life data: marks of students in 5 subjects each
# ------------------------------------------------------------------
students = {
    "Aditi": [88, 92, 79, 85, 90],
    "Rahul": [45, 39, 55, 60, 42],
    "Meera": [70, 65, 72, 68, 75],
    "Sooraj": [30, 25, 40, 35, 28],
    "Kiran": [95, 98, 92, 97, 99],
}

attendance = {"Aditi": 92, "Rahul": 65, "Meera": 78, "Sooraj": 50, "Kiran": 96}


# ------------------------------------------------------------------
# SIMPLE IF STATEMENT
# ------------------------------------------------------------------
print("----- ATTENDANCE WARNING CHECK (simple if) -----")
for name in attendance:                 # for loop
    if attendance[name] < 75:            # simple if
        print(f"Warning: {name} has low attendance ({attendance[name]}%)")
print()


# ------------------------------------------------------------------
# IF-ELSE STATEMENT
# ------------------------------------------------------------------
print("----- PASS / FAIL STATUS (if-else) -----")
for name, marks in students.items():
    average = sum(marks) / len(marks)
    if average >= 40:
        print(f"{name}: PASS (avg={average:.2f})")
    else:
        print(f"{name}: FAIL (avg={average:.2f})")
print()


# ------------------------------------------------------------------
# IF-ELIF-ELSE STATEMENT (Grading system)
# ------------------------------------------------------------------
print("----- GRADE ALLOCATION (if-elif-else) -----")
for name, marks in students.items():
    average = sum(marks) / len(marks)

    if average >= 90:
        grade = "A+"
    elif average >= 75:
        grade = "A"
    elif average >= 60:
        grade = "B"
    elif average >= 40:
        grade = "C"
    else:
        grade = "F"

    print(f"{name}: average={average:.2f} -> Grade {grade}")
print()


# ------------------------------------------------------------------
# NESTED IF STATEMENT (Scholarship eligibility)
# ------------------------------------------------------------------
print("----- SCHOLARSHIP ELIGIBILITY (nested if) -----")
for name, marks in students.items():
    average = sum(marks) / len(marks)
    att = attendance[name]

    if average >= 75:                    # outer if
        if att >= 90:                    # nested if
            print(f"{name}: Eligible for FULL scholarship")
        else:
            if att >= 75:                # another nested if
                print(f"{name}: Eligible for PARTIAL scholarship")
            else:
                print(f"{name}: Good marks but attendance too low")
    else:
        print(f"{name}: Not eligible (average below 75)")
print()


# ------------------------------------------------------------------
# WHILE LOOP with BREAK and CONTINUE
# ------------------------------------------------------------------
print("----- SUBJECT-WISE CHECK using WHILE loop -----")
name_list = list(students.keys())
i = 0
while i < len(name_list):
    name = name_list[i]
    marks = students[name]

    j = 0
    subject_failed = False
    while j < len(marks):
        if marks[j] < 33:               # failing mark in a subject
            print(f"{name} failed in subject {j+1} (marks={marks[j]})")
            subject_failed = True
            j += 1
            continue                     # continue checking other subjects
        if marks[j] == 100:
            print(f"{name} scored a perfect 100! Stopping subject check.")
            break                        # break out of inner while loop
        j += 1

    if not subject_failed:
        pass                             # placeholder: nothing special to do
    i += 1
print()


# ------------------------------------------------------------------
# NESTED FOR LOOP (Marks matrix / mark-sheet table)
# ------------------------------------------------------------------
print("----- MARK SHEET TABLE (nested for loop) -----")
subjects = ["Eng", "Math", "Sci", "Soc", "Comp"]

header = "Name".ljust(10)
for sub in subjects:                     # outer loop -> columns header
    header += sub.ljust(6)
print(header)

for name, marks in students.items():     # outer loop -> each student (row)
    row = name.ljust(10)
    for m in marks:                      # inner loop -> each subject mark
        row += str(m).ljust(6)
    print(row)
print()


# ------------------------------------------------------------------
# FOR LOOP with ELSE (rare but valid Python construct)
# ------------------------------------------------------------------
print("----- SEARCH FOR TOPPER (for-else) -----")
topper = None
for name, marks in students.items():
    if sum(marks) / len(marks) >= 95:
        topper = name
        break
else:
    # runs only if the loop completed WITHOUT a break
    print("No student found with average 95 or above.")

if topper:
    print(f"Topper found: {topper}")
