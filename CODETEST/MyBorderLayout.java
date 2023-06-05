import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyBorderLayout extends JFrame {
    public MyBorderLayout() {
        this.setTitle("BorderLayoutEx");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout(10, 10));
        c.add(new JButton("NORTH"), BorderLayout.NORTH);
        c.add(new JButton("WEST"), BorderLayout.WEST);
        c.add(new JButton("CENTER"), BorderLayout.CENTER);
        c.add(new JButton("EAST"), BorderLayout.EAST);
        c.add(new JButton("SOUTH"), BorderLayout.SOUTH);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyBorderLayout();
    }

}
