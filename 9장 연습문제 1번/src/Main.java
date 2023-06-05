import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main extends JFrame{
	public Main() {
		this.setTitle("마우스 올리면");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl = new JLabel("사랑해");
		jl.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {
				jl.setText("자기야");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel label = (JLabel)e.getSource();
				jl.setText("사랑해");
			}
			@Override
			public void mouseClicked(MouseEvent e) {}
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
