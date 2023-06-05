import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ThreadEx6 extends JFrame{
	public ThreadEx6() {
		this.setTitle("버블 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel p = new GamePanel();
		this.setContentPane(p);
		this.setLayout(null);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadEx6();
	}
}

class GamePanel extends JPanel{
	TargetThread targetThread = null;
	Bubble b = null;
	public GamePanel() {
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				b = new Bubble();
				GamePanel.this.add(b);
				b.setLocation(e.getPoint());
				GamePanel.this.startGame();
			}
		});
	}
	public void startGame() {
		if(b != null) {
			targetThread = new TargetThread(b);
			targetThread.start();
		}
	}
}

class Bubble extends JLabel{
	public Bubble() {
		this.setSize(50, 50);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		ImageIcon icon = new ImageIcon("src/img/bubble.png");
		Image img = icon.getImage();
		g.drawImage(img, 0, 0, 50, 50, this);
	}
}

class TargetThread extends Thread{
	Bubble bubble;
	public TargetThread(Bubble bubble) {
		this.bubble = bubble;
	}
	public void run() {
		while(true) {
			int x = bubble.getX();
			int y = bubble.getY() - 5;
			if(y + bubble.getHeight() + 10 < 0) {
				bubble = null;
				return;
			}else {
				bubble.setLocation(x, y);
			}try {
				sleep(20);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
