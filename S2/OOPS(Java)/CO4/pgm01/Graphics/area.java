package Graphics;

import java.util.Scanner;

interface Figures {
    void rectangle();
    void triangle();
    void square();
    void circle();
}

public class Area implements Figures {

    Scanner s = new Scanner(System.in);

    public void rectangle() {
        System.out.print("Enter the length  : ");
        double l = s.nextDouble();
        System.out.print("Enter the breadth : ");
        double b = s.nextDouble();
        System.out.println("Area of the rectangle : " + (l * b));
    }

    public void triangle() {
        System.out.print("Enter the base   : ");
        double base = s.nextDouble();
        System.out.print("Enter the height : ");
        double h = s.nextDouble();
        System.out.println("Area of the triangle : " + (0.5 * base * h));
    }

    public void square() {
        System.out.print("Enter the side : ");
        double side = s.nextDouble();
        System.out.println("Area of the square : " + (side * side));
    }

    public void circle() {
        System.out.print("Enter the radius : ");
        double r = s.nextDouble();
        System.out.printf("Area of the circle : %.2f%n", (3.14 * r * r));
    }
}