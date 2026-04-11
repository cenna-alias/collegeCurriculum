import java.awt.*;
import java.awt.event.*;
class FacePanel extends Panel {
    int percentage = -1;
    public void setPercentage(int p) {
        percentage = p;
        repaint();
    }
    public void paint(Graphics g) {
        if (percentage == -1) return;
        int x = 40, y = 10, size = 60; 
        g.drawOval(x, y, size, size);
        g.fillOval(x + 15, y + 18, 6, 6);
        g.fillOval(x + 35, y + 18, 6, 6);
        if (percentage > 50) {
            g.drawArc(x + 15, y + 30, 30, 15, 180, 180);
        } else {
            g.drawArc(x + 15, y + 35, 30, 15, 0, 180);
        }
    }}
public class PercentageFace extends Frame implements ActionListener {
    TextField t1, t2, t3, t4, t5;
    Label result;
    FacePanel facePanel;
    PercentageFace() {
        setLayout(new FlowLayout());
        add(new Label("Sub1:")); t1 = new TextField(5); add(t1);
        add(new Label("Sub2:")); t2 = new TextField(5); add(t2);

        add(new Label("Sub3:")); t3 = new TextField(5); add(t3);
        add(new Label("Sub4:")); t4 = new TextField(5); add(t4);
        add(new Label("Sub5:")); t5 = new TextField(5); add(t5);
        Button b = new Button("Calculate");
        add(b);
        b.addActionListener(this);
        result = new Label("Result: ");
        result.setPreferredSize(new Dimension(250, 20)); 
        add(result);
        facePanel = new FacePanel();
        facePanel.setPreferredSize(new Dimension(120, 90)); 
        add(facePanel);
        setSize(300, 300); // compact window
        setTitle("Percentage");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }});
    }
    public void actionPerformed(ActionEvent e) {
        int m1 = Integer.parseInt(t1.getText());
        int m2 = Integer.parseInt(t2.getText());
        int m3 = Integer.parseInt(t3.getText());
        int m4 = Integer.parseInt(t4.getText());
        int m5 = Integer.parseInt(t5.getText());
        int percentage = (m1 + m2 + m3 + m4 + m5) / 5;
        result.setText("Percentage: " + percentage + "%");
        facePanel.setPercentage(percentage);
    }
    public static void main(String[] args) {
        new PercentageFace();
    }}
