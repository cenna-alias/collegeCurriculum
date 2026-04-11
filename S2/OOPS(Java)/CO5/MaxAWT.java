import java.awt.*;
import java.awt.event.*;
public class MaxAWT extends Frame implements ActionListener {
    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button b;
    MaxAWT() {
        l1 = new Label("Enter Number 1:");
        l2 = new Label("Enter Number 2:");
        l3 = new Label("Enter Number 3:");
        result = new Label("Result:");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b = new Button("Find Max");
        b.addActionListener(this);
        setLayout(new GridLayout(5, 2));
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b); add(result);
        setTitle("Maximum of Three Numbers");
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

    }
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3 = Integer.parseInt(t3.getText());
        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;
        result.setText("Maximum: " + max);
    }
    public static void main(String[] args) {
        new MaxAWT();
    }
}
