import java.net.*;
public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(5000);
            System.out.println("Server is waiting...");
            byte[] receive = new byte[1024];
            DatagramPacket dp = new DatagramPacket(receive, receive.length);
            ds.receive(dp);
            String msg = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Message from client: " + msg);
            String reply = "Message received by server";
            byte[] send = reply.getBytes();
            DatagramPacket dpSend = new DatagramPacket(
                send, send.length, dp.getAddress(), dp.getPort()
            );
            ds.send(dpSend);
            ds.close();
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }
}
