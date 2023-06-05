import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame{
	public Main() {
		this.setTitle("+,- 키로");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.setFocusable(true);
		cp.requestFocus();
		JLabel jl = new JLabel("Love Java");
		jl.setFont(new Font("Arial", Font.PLAIN, 10));
		cp.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				Font f = jl.getFont();
				int size = f.getSize();
				if(e.getKeyChar() == '+') {
					jl.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				else if(e.getKeyChar() == '-' && size > 5) {
					jl.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
		cp.add(jl);
		this.setSize(300, 150);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
	}

}
