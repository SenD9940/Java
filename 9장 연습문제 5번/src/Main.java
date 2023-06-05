import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame{
	public Main() {
		this.setTitle("클릭 연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
		JLabel jl = new JLabel("C");
		jl.setLocation(50, 50);
		jl.setSize(10, 10);
		cp.add(jl);
		cp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int xBound = cp.getWidth();
				int yBound = cp.getHeight();
				int randX = (int)(Math.random() * xBound) + 1;
				int randY = (int)(Math.random() * yBound) + 1;
				jl.setLocation(randX, randY);
			}
		});
		this.setSize(300, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
	}
}