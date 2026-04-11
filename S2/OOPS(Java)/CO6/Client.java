import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket s = new Socket("localhost", 5000);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.print("Enter message: ");
            String msg = sc.nextLine();
            dos.writeUTF(msg);
            String reply = dis.readUTF();
            System.out.println("Server reply: " + reply);
            dos.close();
            dis.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
        sc.close();
    }
}
