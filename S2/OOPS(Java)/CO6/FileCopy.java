import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter source file name: ");
            String source = sc.nextLine();
            System.out.print("Enter destination file name: ");
            String destination = sc.nextLine();
            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fout = new FileOutputStream(destination);
            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            fin.close();
            fout.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
        sc.close();
    }
}
