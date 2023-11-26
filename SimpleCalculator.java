import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton[] digitButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton,
            clearButton;
    private double currentResult;
    private char currentOperator;

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(Integer.toString(i));
            digitButtons[i].addActionListener(new DigitButtonActionListener());
        }
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");
        addButton.addActionListener(new OperatorButtonActionListener('+'));
        subtractButton.addActionListener(new OperatorButtonActionListener('-'));
        multiplyButton.addActionListener(new OperatorButtonActionListener('*'));
        divideButton.addActionListener(new OperatorButtonActionListener('/'));
        equalsButton.addActionListener(new EqualsButtonActionListener());
        clearButton.addActionListener(new ClearButtonActionListener());
        panel.add(digitButtons[1]);
        panel.add(digitButtons[2]);
        panel.add(digitButtons[3]);
        panel.add(addButton);
        panel.add(digitButtons[4]);
        panel.add(digitButtons[5]);
        panel.add(digitButtons[6]);
        panel.add(subtractButton);
        panel.add(digitButtons[7]);
        panel.add(digitButtons[8]);
        panel.add(digitButtons[9]);
        panel.add(multiplyButton);
        panel.add(digitButtons[0]);
        panel.add(clearButton);
        panel.add(equalsButton);
        panel.add(divideButton);
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    private class DigitButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String currentText = textField.getText();
            textField.setText(currentText + button.getText());
        }
    }

    private class OperatorButtonActionListener implements ActionListener {
        private char operator;

        OperatorButtonActionListener(char operator) {
            this.operator = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            currentOperator = operator;
            currentResult = Double.parseDouble(textField.getText());
            textField.setText("");
        }
    }

    private class EqualsButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputText = textField.getText();
            if (!inputText.isEmpty()) {
                double secondOperand = Double.parseDouble(inputText);
                double result = 0.0;
                switch (currentOperator) {
                    case '+':
                        result = currentResult + secondOperand;
                        break;
                    case '-':
                        result = currentResult - secondOperand;
                        break;
                    case '*':
                        result = currentResult * secondOperand;
                        break;
                    case '/':
                        if (secondOperand != 0) {
                            result = currentResult / secondOperand;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
            }
        }
    }

    private class ClearButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
            currentResult = 0.0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator());
    }
}