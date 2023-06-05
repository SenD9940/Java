import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGridLayout extends JFrame {
    public MyGridLayout() {
        this.setTitle("GridLayoutEx");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 3, 5, 5));
        for (int i = 0; i < 12; i++) {
            c.add(new JButton(String.valueOf(i)));
        }
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}
