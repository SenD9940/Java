import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyMouseListener extends JFrame {
    private JLabel la = new JLabel("Click Anywhere");

    public MyMouseListener() {
        this.setTitle("MoueListener Ex");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        la.setSize(100, 20);
        la.setLocation(30, 30);
        c.add(la);
        c.setLayout(null);
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                la.setLocation(x, y);
                la.setText(String.valueOf("(" + x + "," + y + ")"));
            }
        });
        this.setLocationRelativeTo(this.getOwner());
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyMouseListener();
    }
}
