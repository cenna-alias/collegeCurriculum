import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n for Fibonacci series: ");
        int n = scanner.nextInt();
        System.out.print("Enter the range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        evenNumberPrinter evenNumberPrinter = new evenNumberPrinter(start, end);
        Thread evenThread = new Thread(evenNumberPrinter);
        evenThread.start();
        fibonacciGenerator fibonacciGenerator = new fibonacciGenerator(n);
        Thread fibonacciThread = new Thread(fibonacciGenerator);
        fibonacciThread.start();
        scanner.close();
    }
}