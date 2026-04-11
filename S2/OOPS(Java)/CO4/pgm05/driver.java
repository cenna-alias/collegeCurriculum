import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        Mul obj1 = new Mul();
        obj1.start();

        Prime obj2 = new Prime(number);
        obj2.start();
    }
}