import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyFrame extends JFrame {
	JLabel label;
	public MyFrame() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		label = new JLabel("hello");
		label.setBounds(50, 50, 50, 20);
		cp.add(label);
		cp.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);
			}
		});
		this.setSize(300, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getParent());
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myFrame = new MyFrame();
	}
}
