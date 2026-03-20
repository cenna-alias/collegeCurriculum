# Lambda functions to find area of square, rectangle and triangle
square_area = lambda s: s * s
rectangle_area = lambda l, b: l * b
triangle_area = lambda b, h: 0.5 * b * h

print("Area of square:", square_area(4))
print("Area of rectangle:", rectangle_area(5, 3))
print("Area of triangle:", triangle_area(6, 4))
