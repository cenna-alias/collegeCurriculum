import java.awt.*;
import java.awt.event.*;
public class CalculatorAWT extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button add, sub, mul, div;
    CalculatorAWT() {
        setLayout(new GridLayout(5, 2, 5, 5)); // compact grid
        add(new Label("Num1:"));
        t1 = new TextField();
        add(t1);
        add(new Label("Num2:"));
        t2 = new TextField();
        add(t2);
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        add(add); add(sub);
        add(mul); add(div);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        add(new Label("Result:"));
        result = new TextField();
        result.setEditable(false);
        add(result);
        setTitle("Calculator");
        setSize(250, 200);   

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(t1.getText());
        double n2 = Double.parseDouble(t2.getText());
        double res = 0;
        if (e.getSource() == add)
            res = n1 + n2;
        else if (e.getSource() == sub)
            res = n1 - n2;
        else if (e.getSource() == mul)
            res = n1 * n2;
        else if (e.getSource() == div)
            res = n1 / n2;
        result.setText(String.valueOf(res));
    }
    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
