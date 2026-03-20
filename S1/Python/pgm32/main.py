import graphics.rectangle
import graphics.circle
import graphics.threeDgraphics.cuboid
import graphics.threeDgraphics.sphere

l=10
b=5
h=4
r=7

print("Area of rectangle:",graphics.rectangle.area(l,b))
print("Perimeter of rectangle:",graphics.rectangle.perimeter(l,b))

print("Area of circle:",graphics.circle.area(r))
print("Perimeter of circle:",graphics.circle.perimeter(r))

print("Area of cuboid:",graphics.threeDgraphics.cuboid.area(l,b,h))
print("Volume of cuboid:",graphics.threeDgraphics.cuboid.volume(l,b,h))

print("Area of sphere:",graphics.threeDgraphics.sphere.area(r))
print("Volume of sphere:",graphics.threeDgraphics.sphere.volume(r))
