package subject6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyCalc extends JFrame {
    private JTextField displayField1;
    private JTextField displayField2;
    private String currentInput = "";

    public MyCalc() {
        setTitle("Calc_고건영");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayField1 = new JTextField();
        displayField2 = new JTextField();
        displayField1.setHorizontalAlignment(JTextField.RIGHT);
        displayField2.setHorizontalAlignment(JTextField.RIGHT);


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

        JPanel displayPanel = new JPanel(new GridLayout(2, 1));
        displayPanel.add(displayField1);
        displayPanel.add(displayField2);
        c.add(displayPanel, BorderLayout.NORTH);

        JPanel labelPanel = new JPanel(new GridLayout(2, 1));


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4, 5, 5));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        c.add(buttonPanel, BorderLayout.CENTER);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        // Add KeyListener to handle keyboard input
        c.addKeyListener(new MyKeyListener());
        c.setFocusable(true);
        c.requestFocus();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();
            handleButtonClick(buttonText);

            getContentPane().requestFocus();
        }
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyTyped(KeyEvent e) {
            char keyChar = e.getKeyChar();
            handleKeyInput(keyChar);
        }
    }

    private void handleButtonClick(String buttonText) {
        switch (buttonText) {
            case "=":
                evaluateExpression();
                break;
            case "C":
                clearInput();
                break;
            case "%":
            case "/":
            case "X":
            case "-":
            case "+":
                handleOperator(buttonText);
                break;
            default:
                updateInput(buttonText);
                break;
        }
    }
    private void handleOperator(String operator) {
        if (!currentInput.isEmpty()) {
            currentInput += " " + operator + " ";
            displayField1.setText(currentInput);
        }
    }

    private void handleKeyInput(char keyChar) {
        String key = String.valueOf(keyChar);

        if (Character.isDigit(keyChar) || key.equals(".")) {
            // 숫자인 경우
            updateInput(key);
        } else if (key.equals("/") || key.equals("x") || key.equals("X") || key.equals("-") || key.equals("+") || key.equals("%")) {
            // 연산자인 경우
            handleOperator(key);
        } else if (keyChar == KeyEvent.VK_ENTER|| key.equals("=")) {
            // 엔터를 쳤으면
            evaluateExpression();
        } else if (keyChar == KeyEvent.VK_DELETE || keyChar == KeyEvent.VK_BACK_SPACE) {
            // 지우는 키인 경우
            handleDelete();
        } else if (Character.isLetter(keyChar)) {
            // 문자 키인 경우 그냥 넘어가게
        }
    }
    private void handleDelete() {
        if (!currentInput.isEmpty()) {
            currentInput = currentInput.substring(0, currentInput.length() - 1);
            displayField1.setText(currentInput);
        }
    }
    private void updateInput(String input) {
        currentInput += input;
        displayField1.setText(currentInput);
    }

    private void evaluateExpression() {
        String expression = currentInput;
        // 간단한 문자열 계산 로직
        // {number} {operation} {number} 이 경우만 해당하게 구현 했다.
        double result = evaluateSimpleExpression(expression);
        displayField2.setText(String.valueOf(result));

        // field1 초기화
        currentInput="";
        displayField1.setText("");
    }

    private double evaluateSimpleExpression(String expression) {
        String[] tokens = expression.split(" ");
        double operand1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double operand2 = Double.parseDouble(tokens[2]);

        switch (operator) {
            case "/":
                if (operand2 == 0) {
                    throw new IllegalArgumentException("0으로 나누기는 안됩니다. ");
                }
                return operand1 / operand2;
            case "%":
                return operand1 % operand2;
            case "X":
                return operand1 * operand2;
            case "-":
                return operand1 - operand2;
            case "+":
                return operand1 + operand2;
            case "=":
                return operand2; // "="는 결과를 그대로 반환
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다." );
        }
    }

    private void clearInput() {
        currentInput = "";
        displayField1.setText("");
        displayField2.setText("");
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}
