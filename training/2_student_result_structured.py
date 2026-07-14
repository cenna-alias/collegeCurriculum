"""
Real-Life Application: STUDENT RESULT AND ATTENDANCE SYSTEM
"""

# ------------------------------------------------------------------
# if-else
# ------------------------------------------------------------------
exam_marks = 35
if exam_marks >= 40:
    print("Result: Pass")
else:
    print("Result: Fail")


# ------------------------------------------------------------------
# if-elif-else
# ------------------------------------------------------------------
subject_marks = 78
if subject_marks >= 90:
    print("Grade: A")
elif subject_marks >= 75:
    print("Grade: B")
elif subject_marks >= 60:
    print("Grade: C")
else:
    print("Grade: D")


# ------------------------------------------------------------------
# nested if
# ------------------------------------------------------------------
age = 20
has_id_card = True
if age >= 18:
    if has_id_card:
        print("Entry Allowed")
    else:
        print("ID Card Required")
else:
    print("Entry Denied: Underage")


# ------------------------------------------------------------------
# while loop
# ------------------------------------------------------------------
class_day = 1
while class_day <= 5:
    print("Class Day", class_day)
    class_day += 1


# ------------------------------------------------------------------
# for loop (counting with range)
# ------------------------------------------------------------------
for roll_no in range(1, 6):
    print("Roll Number:", roll_no)


# ------------------------------------------------------------------
# for-each loop (going through each item in a collection)
# ------------------------------------------------------------------
student_list = ["Anu", "Rahul", "Meera"]
for student_name in student_list:
    print("Student:", student_name)
