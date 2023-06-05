import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame{
	public Main() {
		this.setTitle("3x4 Color Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4, 3));
		this.initJLabel(cp);
		this.setSize(300, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
	}
	
	public void initJLabel(Container cp) {
		int name = 0;
		for(int i = 0; i < 4; i++) {
			for(int k = 0; k < 3; k++) {
				JLabel jl = new JLabel(String.valueOf(name));
				jl.setOpaque(true);
				jl.setBackground(Color.WHITE);
				jl.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int red = (int)(Math.random() * 256);
						int green = (int)(Math.random() * 256);
						int blue = (int)(Math.random() * 256);
						jl.setBackground(new Color(red, green, blue));
					}
				});
				cp.add(jl);
				name += 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
	}

}
