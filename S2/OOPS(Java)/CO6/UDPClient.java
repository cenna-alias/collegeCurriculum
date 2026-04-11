import java.net.*;
import java.util.Scanner;
public class UDPClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            DatagramSocket ds = new DatagramSocket();
            System.out.print("Enter message: ");
            String msg = sc.nextLine();
            byte[] send = msg.getBytes();
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(
                send, send.length, ip, 5000
            );
            ds.send(dp);
            byte[] receive = new byte[1024];
            DatagramPacket dpReceive = new DatagramPacket(receive, receive.length);
            ds.receive(dpReceive);
            String reply = new String(
                dpReceive.getData(), 0, dpReceive.getLength()
            );
            System.out.println("Server reply: " + reply);
            ds.close();
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
        sc.close();
    }
}
