import java.util.Scanner;

public class Shapes
{
    int    a;
    int    area;
    float  x;
    double y;

    void area(int l, int b)
    {
        a = l * b;
        System.out.println("Area: " + a);
    }

    void area(int s)
    {
        area = s * s;
        System.out.println("Area: " + area);
    }

    void area(float b, float h)
    {
        x = (b * h) / 2;
        System.out.println("Area: " + x);
    }

    void area(double r)
    {
        y = 3.14 * r * r;
        System.out.printf("Area: %.2f%n", y);
    }

    public static void main(String[] args)
    {
        Shapes obj = new Shapes();
        Scanner sc = new Scanner(System.in);

        System.out.println("***** Area of different shapes using overloaded functions *****");

        System.out.println("\n---- RECTANGLE ----");
        System.out.println("Enter the length and breadth:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        obj.area(l, b);

        System.out.println("\n---- SQUARE ----");
        System.out.println("Enter the side:");
        int s = sc.nextInt();
        obj.area(s);

        System.out.println("\n---- TRIANGLE ----");
        System.out.println("Enter the base and height:");
        float base   = sc.nextFloat();
        float height = sc.nextFloat();
        obj.area(base, height);

        System.out.println("\n---- CIRCLE ----");
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        obj.area(r);

        sc.close();
    }
}