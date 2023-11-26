import java.awt.*;
import javax.swing.*;

public class menu extends JFrame {
    menu() {
        setLayout(null);
        setTitle("Java AWT Exmaple");
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 700, 60);
        add(mb);
        JMenu m = new JMenu("File");
        JMenu m1 = new JMenu("Edit");
        JMenu m2 = new JMenu("About");
        m.setBounds(100, 50, 250, 150);
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        JMenu i4 = new JMenu("Show About");
        JMenuItem i5 = new JMenuItem("Exit");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        i4.add(i5);
        mb.add(m);
        mb.add(m1);
        mb.add(m2);
        setSize(700, 600);
        setLocation(200, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new menu();
    }
}