"""
Real-Life Application: SUPERMARKET BILLING SYSTEM
====================================================
This program demonstrates:
  1. All Python Datatypes  (int, float, str, bool, list, tuple,
     dict, set, complex, NoneType)
  2. All Python Operators  (arithmetic, relational, logical,
     bitwise, assignment, identity, membership)
  3. Class and Objects
  4. Four different user-defined functions
"""

# ------------------------------------------------------------------
# 1. DEMONSTRATION OF ALL DATATYPES
# ------------------------------------------------------------------
def show_datatypes():
    """Displays all the basic Python datatypes using real store data."""
    item_count = 25                     # int
    price_per_kg = 42.75                # float
    shop_name = "Green Valley Mart"     # str
    is_open = True                      # bool
    cart_items = ["Rice", "Wheat", "Sugar"]           # list
    store_location = ("Kerala", "India")              # tuple
    stock = {"Rice": 25, "Wheat": 40, "Sugar": 15}     # dict
    unique_categories = {"Grocery", "Dairy", "Grocery"}  # set (auto removes duplicate)
    discount_factor = 2 + 3j            # complex
    manager_name = None                 # NoneType

    print("----- DATATYPE DEMONSTRATION -----")
    print("int      :", item_count, type(item_count))
    print("float    :", price_per_kg, type(price_per_kg))
    print("str      :", shop_name, type(shop_name))
    print("bool     :", is_open, type(is_open))
    print("list     :", cart_items, type(cart_items))
    print("tuple    :", store_location, type(store_location))
    print("dict     :", stock, type(stock))
    print("set      :", unique_categories, type(unique_categories))
    print("complex  :", discount_factor, type(discount_factor))
    print("NoneType :", manager_name, type(manager_name))
    print()


# ------------------------------------------------------------------
# 2. DEMONSTRATION OF ALL OPERATORS
# ------------------------------------------------------------------
def show_operators():
    """Displays all Python operator categories using billing values."""
    price = 100
    qty = 3
    discount = 10

    print("----- OPERATOR DEMONSTRATION -----")

    # Arithmetic operators
    total = price * qty
    after_discount = total - discount
    tax = total * 0.05
    remainder = total % 7
    power = qty ** 2
    floor_div = total // 9
    print("Arithmetic -> total:", total, "| after_discount:", after_discount,
          "| tax:", tax, "| remainder:", remainder,
          "| power:", power, "| floor_div:", floor_div)

    # Relational (comparison) operators
    print("Relational -> price>discount:", price > discount,
          "| price==100:", price == 100, "| qty!=3:", qty != 3,
          "| price<=100:", price <= 100, "| discount>=5:", discount >= 5)

    # Logical operators
    is_member = True
    has_coupon = False
    print("Logical -> member AND coupon:", is_member and has_coupon,
          "| member OR coupon:", is_member or has_coupon,
          "| NOT member:", not is_member)

    # Bitwise operators
    a, b = 6, 3   # binary 110, 011
    print("Bitwise -> a&b:", a & b, "| a|b:", a | b, "| a^b:", a ^ b,
          "| ~a:", ~a, "| a<<1:", a << 1, "| a>>1:", a >> 1)

    # Assignment operators
    stock_qty = 50
    stock_qty += 10   # sold restock
    stock_qty -= 5    # sold
    stock_qty *= 2
    stock_qty //= 3
    print("Assignment -> final stock_qty:", stock_qty)

    # Identity operators
    x = [1, 2, 3]
    y = x
    z = [1, 2, 3]
    print("Identity -> x is y:", x is y, "| x is z:", x is z, "| x is not z:", x is not z)

    # Membership operators
    cart = ["Rice", "Sugar", "Milk"]
    print("Membership -> 'Milk' in cart:", "Milk" in cart,
          "| 'Oil' not in cart:", "Oil" not in cart)
    print()


# ------------------------------------------------------------------
# 3. CLASS AND OBJECTS
# ------------------------------------------------------------------
class Product:
    """Represents a single product sold in the supermarket."""

    def __init__(self, name, price, quantity):
        self.name = name
        self.price = price
        self.quantity = quantity

    def total_cost(self):
        """Returns the total cost for this product."""
        return self.price * self.quantity

    def apply_discount(self, percent):
        """Reduces the price of the product by a given percentage."""
        self.price -= (self.price * percent / 100)

    def display(self):
        """Prints product details in a readable bill format."""
        print(f"{self.name:<10} | Qty: {self.quantity:<3} | "
              f"Price: Rs.{self.price:.2f} | Total: Rs.{self.total_cost():.2f}")


def generate_bill(products):
    """4th user-defined function: builds and prints the final bill
    for a list of Product objects (uses the class defined above)."""
    print("----- FINAL BILL -----")
    grand_total = 0
    for product in products:
        product.display()
        grand_total += product.total_cost()
    print(f"{'-'*40}\nGRAND TOTAL: Rs.{grand_total:.2f}\n")


# ------------------------------------------------------------------
# MAIN PROGRAM
# ------------------------------------------------------------------
def main():
    """Driver function that ties everything together."""
    show_datatypes()
    show_operators()

    # Creating objects of the Product class
    p1 = Product("Rice", 60, 5)
    p2 = Product("Milk", 25, 2)
    p3 = Product("Sugar", 40, 3)

    p1.apply_discount(10)   # apply 10% discount on Rice

    generate_bill([p1, p2, p3])


if __name__ == "__main__":
    main()
