"""
Real-Life Application: SIMPLE SHOP BILLING PROGRAM (Beginner Level)
======================================================================
Covers: all datatypes, all operators, one class with objects,
and four simple user-defined functions.
"""

# ------------------------------------------------------------------
# FUNCTION 1: Show all datatypes
# ------------------------------------------------------------------
def show_datatypes():
    a = 10                     # int
    b = 5.5                    # float
    c = "Grocery Shop"         # string
    d = True                   # boolean
    e = [1, 2, 3]               # list
    f = (1, 2, 3)                # tuple
    g = {"item": "Rice", "price": 50}   # dictionary
    h = {1, 2, 3}                # set
    i = 2 + 3j                  # complex number
    j = None                   # none type

    print("int value:", a)
    print("float value:", b)
    print("string value:", c)
    print("boolean value:", d)
    print("list value:", e)
    print("tuple value:", f)
    print("dictionary value:", g)
    print("set value:", h)
    print("complex value:", i)
    print("none value:", j)
    print()


# ------------------------------------------------------------------
# FUNCTION 2: Show all operators
# ------------------------------------------------------------------
def show_operators():
    a = 10
    b = 3

    # Arithmetic operators
    print("Addition:", a + b)
    print("Subtraction:", a - b)
    print("Multiplication:", a * b)
    print("Division:", a / b)
    print("Floor Division:", a // b)
    print("Modulus:", a % b)
    print("Exponent:", a ** b)

    # Comparison operators
    print("a > b:", a > b)
    print("a < b:", a < b)
    print("a == b:", a == b)
    print("a != b:", a != b)
    print("a >= b:", a >= b)
    print("a <= b:", a <= b)

    # Logical operators
    x = True
    y = False
    print("x and y:", x and y)
    print("x or y:", x or y)
    print("not x:", not x)

    # Bitwise operators
    print("a & b:", a & b)
    print("a | b:", a | b)
    print("a ^ b:", a ^ b)
    print("~a:", ~a)
    print("a << 1:", a << 1)
    print("a >> 1:", a >> 1)

    # Assignment operators
    c = 5
    c += 2
    c -= 1
    c *= 3
    c //= 2
    print("final value of c:", c)

    # Membership operators
    fruits = ["apple", "banana", "mango"]
    print("'apple' in fruits:", "apple" in fruits)
    print("'grapes' not in fruits:", "grapes" not in fruits)

    # Identity operators
    p = [1, 2]
    q = p
    r = [1, 2]
    print("p is q:", p is q)
    print("p is r:", p is r)
    print()


# ------------------------------------------------------------------
# CLASS AND OBJECTS
# ------------------------------------------------------------------
class Item:
    def __init__(self, name, price, quantity):
        self.name = name
        self.price = price
        self.quantity = quantity

    def total_price(self):
        return self.price * self.quantity


# ------------------------------------------------------------------
# FUNCTION 3: Create item objects
# ------------------------------------------------------------------
def create_items():
    item1 = Item("Rice", 50, 2)
    item2 = Item("Sugar", 40, 1)
    item3 = Item("Milk", 25, 3)
    return [item1, item2, item3]


# ------------------------------------------------------------------
# FUNCTION 4: Print the final bill
# ------------------------------------------------------------------
def print_bill(item_list):
    print("----- BILL -----")
    grand_total = 0
    for item in item_list:
        cost = item.total_price()
        print(item.name, "x", item.quantity, "=", cost)
        grand_total = grand_total + cost
    print("Grand Total:", grand_total)


# ------------------------------------------------------------------
# MAIN PROGRAM
# ------------------------------------------------------------------
show_datatypes()
show_operators()
items = create_items()
print_bill(items)
