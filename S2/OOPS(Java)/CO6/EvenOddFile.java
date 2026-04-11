import java.io.*;
import java.util.Scanner;
public class EvenOddFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter input file name: ");
            String input = sc.nextLine();
            FileReader fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");
            String line;
            while ((line = br.readLine()) != null) {
                String[] nums = line.split(" ");
                for (String num : nums) {
                    int n = Integer.parseInt(num);
                    if (n % 2 == 0) {
                        evenWriter.write(n + " ");
                    } else {
                        oddWriter.write(n + " ");
                    }
                }
            }
            br.close();
            evenWriter.close();
            oddWriter.close();
            System.out.println("Even and Odd numbers separated successfully.");

        } catch (Exception e) {
            System.out.println("Error occurred");
        }
        sc.close();
    }
}
