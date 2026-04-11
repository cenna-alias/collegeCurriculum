public class Mul extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}