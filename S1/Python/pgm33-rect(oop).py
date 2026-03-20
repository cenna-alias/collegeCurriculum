class Rectangle:
    def __init__(self, length, breadth):
        self.length = length
        self.breadth = breadth

    def area(self):
        return self.length * self.breadth

    def perimeter(self):
        return 2 * (self.length + self.breadth)

r1 = Rectangle(4, 5)
r2 = Rectangle(3, 8)

print("Area of Rectangle 1:", r1.area())
print("Area of Rectangle 2:", r2.area())

if r1.area() > r2.area():
    print("Rectangle 1 is bigger")
elif r1.area() < r2.area():
    print("Rectangle 2 is bigger")
else:
    print("Both have equal area")
