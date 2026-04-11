import java.util.Scanner;
interface prop
{
	void getdata();
	void area();
	void perimeter();
}
class Circle implements prop {
	double pi = 3.14;
	double r;
	Scanner sc = new Scanner(System.in);
	public void getdata() {
		System.out.println("Enter the radius of the circle: ");
		r = sc.nextDouble();
	}
	public void area() {
		System.out.println("Area of the circle: "+(pi*r*r));
	}
	public void perimeter() {
		System.out.println("Perimeter of the circle: "+(2*pi*r));
	}
}
class Rectangle implements prop {
	double l,b;
	Scanner sc = new Scanner(System.in);
	public void getdata() {
		System.out.println("Enter the length of the rectangle: ");
		l = sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle: ");
		b = sc.nextDouble();
	}
	public void area() {
		System.out.println("Area of the rectangle: "+(l*b));
	}
	public void perimeter() {
		System.out.println("Perimeter of the rectangle: "+(2*(l+b)));
	}
}
public class prototype	{
	public static void main(String args[]) {
		int ch;
		Scanner sc = new Scanner(System.in);
		Circle ob = new Circle();
		Rectangle obj = new Rectangle();
		do {
			System.out.println("\n1.Circle\n2.Rectangle\n3.Exit");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch(ch) {
				case 1 :ob.getdata();
					ob.area();
					ob.perimeter();
					break;
				case 2 :obj.getdata();
					obj.area();
					obj.perimeter();
					break;
				case 3 :System.out.println("Exited...");
					System.exit(0);
			}
		}
	while(true);
	}
}