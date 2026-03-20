class Rectangle:
    def __init__(self, length, width):
        self.__length = length
        self.__width = width

    def area(self):
        return self.__length * self.__width

    def __lt__(self, other):
        return self.area() < other.area()


length1 = float(input("Enter length of Rectangle 1: "))
width1 = float(input("Enter width of Rectangle 1: "))
length2 = float(input("Enter length of Rectangle 2: "))
width2 = float(input("Enter width of Rectangle 2: "))

r1 = Rectangle(length1, width1)
r2 = Rectangle(length2, width2)

if r1 < r2:
    print("Rectangle 1 is smaller")
elif r2 < r1:
    print("Rectangle 2 is smaller")
else:
    print("Both rectangles have equal area")
