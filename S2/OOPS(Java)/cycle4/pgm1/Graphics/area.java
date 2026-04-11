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
        System.out.print("Enter the length: ");
        int l = s.nextInt();

        System.out.print("Enter the breadth: ");
        int b = s.nextInt();

        System.out.println("Area of the rectangle: " + (l * b));
    }

    public void triangle() {
        System.out.print("Enter the base: ");
        int base = s.nextInt();

        System.out.print("Enter the height: ");
        int h = s.nextInt();

        System.out.println("Area of the triangle: " + (0.5 * base * h));
    }

    public void square() {
        System.out.print("Enter the side: ");
        int side = s.nextInt();

        System.out.println("Area of the square: " + (side * side));
    }

    public void circle() {
        System.out.print("Enter the radius: ");
        float r = s.nextFloat();

        System.out.println("Area of the circle: " + (Math.PI * r * r));
    }

    public static void main(String[] args) {
        Area obj = new Area();

        obj.rectangle();
        obj.triangle();
        obj.square();
        obj.circle();
    }
}