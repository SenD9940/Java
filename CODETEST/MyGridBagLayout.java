import java.awt.*;
import javax.swing.*;

public class MyGridBagLayout extends JFrame {
    GridBagLayout gb = new GridBagLayout();

    public MyGridBagLayout() {
        this.setTitle("GridBagLayoutEx");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(gb);
        JLabel lbReceive = new JLabel("받는 사람", Label.RIGHT);
        JLabel lbContent = new JLabel("내용: ", Label.RIGHT);
        JLabel lbFile = new JLabel("첨부 파일: ", Label.RIGHT);
        TextField toPerson = new TextField(40);
        TextField file = new TextField(30);
        TextArea content = new TextArea(5, 40);
        JButton btnSearch = new JButton("찾아보기");
        JButton btnSend = new JButton("보내기");
        this.insert(lbReceive, 0, 0, 1, 1);
        this.insert(toPerson, 1, 0, 3, 1);
        this.insert(lbContent, 0, 1, 1, 1);
        this.insert(content, 1, 1, 3, 1);
        this.insert(lbFile, 0, 2, 1, 1);
        this.insert(file, 1, 2, 2, 1);
        this.insert(btnSearch, 3, 2, 1, 1);
        this.insert(btnSend, 0, 3, 4, 1);
        this.pack();
        this.setLocationRelativeTo(this.getOwner());
        this.setVisible(true);
    }

    public void insert(Component cmpt, int x, int y, int w, int h) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        this.gb.setConstraints(cmpt, gbc);
        this.add(cmpt);
    }

    public static void main(String[] args) {
        new MyGridBagLayout();
    }

}
