import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.w3c.dom.css.RGBColor;

public class MyKeyListener extends JFrame {
    private JLabel la = new JLabel("ENTER");
    Container c = getContentPane();

    public MyKeyListener() {
        this.setTitle("KeyEvent Ex");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(new FlowLayout());
        c.add(la);
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);
                if (e.getKeyChar() == '\n') {
                    la.setText("r=" + r + ", g=" + g + ", b=" + b);
                    c.setBackground(new Color(r, g, b));
                }
            }
        });
        c.setFocusable(true);
        c.requestFocus();
        this.setSize(300, 250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyKeyListener();
    }
}
