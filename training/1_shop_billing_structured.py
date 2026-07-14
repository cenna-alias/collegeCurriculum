"""
Real-Life Application: SHOP BILLING SYSTEM
"""

# ------------------------------------------------------------------
# DATATYPES
# ------------------------------------------------------------------
quantity = 10                     # int
price = 3.5                       # float
signal_value = 2 + 3j             # complex
cart = ["Rice", "Milk", "Sugar"]  # list
shop_name = "Green Mart"          # string
location = ("Kerala", "India")    # tuple
categories = {"Grocery", "Dairy"} # set
stock = {"rice": 20, "milk": 15}  # dictionary
is_open = True                    # boolean
manager = None                    # none

print(quantity, type(quantity))
print(price, type(price))
print(signal_value, type(signal_value))
print(cart, type(cart))
print(shop_name, type(shop_name))
print(location, type(location))
print(categories, type(categories))
print(stock, type(stock))
print(is_open, type(is_open))
print(manager, type(manager))
print()


# ------------------------------------------------------------------
# USER DEFINED FUNCTIONS
# ------------------------------------------------------------------

# 1) with return type, without parameter
def get_shop_name():
    return "Green Mart"


# 2) with return type, with parameter
def calculate_total(item_price, item_quantity):
    return item_price * item_quantity


# 3) without return, with parameter
def display_item(item_name, item_price):
    print(item_name, "costs", item_price)


# 4) without return, without parameter
def welcome_message():
    print("Welcome to the shop!")


welcome_message()
name = get_shop_name()
print("Shop Name:", name)
total = calculate_total(50, 2)
print("Total Price:", total)
display_item("Rice", 50)
print()


# ------------------------------------------------------------------
# OPERATORS
# ------------------------------------------------------------------
price, discount = 10, 3

# arithmetic
print(price + discount, price - discount, price * discount,
      price / discount, price // discount, price % discount, price ** discount)

# assignment
price += 5
print(price)

# comparison
print(price > discount, price == discount, price != discount)

# logical
is_member, has_coupon = True, False
print(is_member and has_coupon, is_member or has_coupon, not is_member)

# bitwise
print(price & discount, price | discount, price ^ discount,
      ~price, price << 1, price >> 1)

# identity
cart_a = [1, 2]
cart_b = cart_a
print(cart_a is cart_b)

# membership
print("Rice" in cart)
print()


# ------------------------------------------------------------------
# CLASS AND OBJECTS
# ------------------------------------------------------------------
class Item:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def show(self):
        print(self.name, "-", self.price)


item1 = Item("Rice", 50)
item2 = Item("Milk", 25)

item1.show()
item2.show()
