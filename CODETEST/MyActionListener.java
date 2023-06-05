import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyActionListener extends JFrame {
    public MyActionListener() {
        this.setTitle("Action Event Ex");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton jb = new JButton("Action");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton j_button = (JButton) e.getSource();
                if (j_button.getText().equals("Action")) {
                    j_button.setText("액션");
                } else {
                    j_button.setText("Action");
                }
            }
        });
        c.add(jb);
        this.setSize(250, 100);
        this.setResizable(false);
        this.setLocationRelativeTo(this.getOwner());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyActionListener();
    }

}
