import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class login extends JFrame implements ActionListener {
    JButton signup, clear, login;
    JTextField cardTextField;
    JPasswordField pinTextField;

    login() {
        setLayout(null);
        // frame title
        setTitle("LoginField | Abujar");

        // name of machine
        JLabel text = new JLabel("Welcome to LoginField | Abujar");
        text.setFont(new Font("Osward", Font.BOLD, 35));
        text.setBounds(100, 40, 600, 50);
        add(text);
        // cardno
        JLabel cardno = new JLabel("Username:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 25));
        cardno.setBounds(110, 150, 150, 40);
        add(cardno);
        // input for card no
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 40);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        // pin
        JLabel pin = new JLabel("Password:");
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(110, 220, 150, 40);
        add(pin);

        // input for pin
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 40);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        // Sign-inButtons
        login = new JButton("SIGN-IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        // clear
        clear = new JButton("CLEAR");
        clear.setBounds(450, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        // Sign-upButtons
        signup = new JButton("SIGN-UP");
        signup.setBounds(300, 350, 250, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        // framecolour
        getContentPane().setBackground(Color.white);
        // frame design
        setSize(800, 480);
        setLocation(350, 200);

        setVisible(true);
    }

    public static void main(String[] args) {
        new login();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {

            try {

                JOptionPane.showMessageDialog(null, "Incorrect Card Nmber Or Pin");
            }

            catch (Exception e) {
                System.out.println(e); // TODO: handle exception
            }

        } else if (ae.getSource() == signup) {
            setVisible(false);

        }

    }
}
