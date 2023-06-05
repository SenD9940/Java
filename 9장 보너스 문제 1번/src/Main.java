import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame{
	public Main() {
		this.setTitle("마우스 휠을 굴리면");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		JLabel jl = new JLabel("Love Java");
		jl.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// TODO Auto-generated method stub
				int size = jl.getFont().getSize();
				int n = e.getWheelRotation();
				if(n < 0) {
					size += 5;
				}else if(n > 0) {
					size -= 5;
					if(size < 5) {
						size = 5;
					}
				}
				jl.setFont(new Font("Arial", Font.PLAIN, size));
			}
		});
		cp.add(jl);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Main main = new Main();
	}
}
