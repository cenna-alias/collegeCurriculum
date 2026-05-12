import java.util.Scanner;
import ArithmeticPackage.Operands;

public class MathOperations {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("____ ARITHMETIC OPERATIONS ____");
        System.out.print("Enter any two numbers to be operated with: ");

        float a = s.nextFloat();
        float b = s.nextFloat();

        Operands op = new Operands(a, b);

        op.add();
        op.sub();
        op.mul();
        op.div();

        s.close();
    }
}