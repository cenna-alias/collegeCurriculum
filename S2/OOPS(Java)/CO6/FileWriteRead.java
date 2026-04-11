import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileWriteRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("sample.txt");
            System.out.print("Enter text to write into file: ");
            String text = sc.nextLine();
            fw.write(text);
            fw.close();
            System.out.println("\nData written to file successfully.");
            FileReader fr = new FileReader("sample.txt");
            int ch;
            System.out.println("\nReading from file:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
        sc.close();
    }
}
