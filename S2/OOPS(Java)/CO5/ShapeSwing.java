import javax.swing.*;
import java.awt.*;
public class ShapeSwing extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(50, 50, 200, 50);
        g.drawRect(50, 80, 150, 80);
        g.drawOval(50, 180, 100, 100);
        g.drawString("Line", 210, 50);
        g.drawString("Rectangle", 210, 120);
        g.drawString("Circle", 210, 230);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes using Swing");
        ShapeSwing panel = new ShapeSwing();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
