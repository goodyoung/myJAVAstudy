package subject5;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Calc_고건영");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);

        String[] buttonLabels = {
                "%", "CE", "C", "DEL",
                "1/x", "x^2", "x^(1/2)", "/",
                "7", "8", "9", "X",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ".", "="
        };

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(displayField, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4, 5, 5));
        for (String label : buttonLabels) {JButton button = new JButton(label);
            buttonPanel.add(button);}
        c.add(buttonPanel, BorderLayout.CENTER);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {new MyFrame();}
}
