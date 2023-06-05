import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ThreadEx5 extends JFrame{
	public ThreadEx5() {
		this.setTitle("사격 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel p = new GamePanel();
		this.setContentPane(p);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setVisible(true);
		p.startGame();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadEx5();
	}
}

class GamePanel extends JPanel{
	TargetThread targetThread;
	JLabel baseLabel = new JLabel();
	JLabel bulletLabel = new JLabel();
	JLabel targetLabel;
	
	public GamePanel() {
		this.setLayout(null);
		baseLabel.setSize(40, 40);
		baseLabel.setOpaque(true);
		baseLabel.setBackground(Color.BLACK);
		ImageIcon img = new ImageIcon("src/img/chicken.jpeg");
		targetLabel.setSize(50, 50);
		bulletLabel.setSize(10, 10);
		bulletLabel.setOpaque(true);
		bulletLabel.setBackground(Color.RED);
		this.add(baseLabel);
		this.add(targetLabel);
		this.add(bulletLabel);
	}
	
	public void startGame() {
		baseLabel.setLocation(this.getWidth() / 2-20, this.getHeight() - 40);
		bulletLabel.setLocation(this.getWidth() / 2-5, this.getHeight() - 50);
		targetLabel.setLocation(0, 0);
		targetThread = new TargetThread(targetLabel);
		targetThread.start();
		baseLabel.requestFocus();
		baseLabel.addKeyListener(new KeyAdapter() {
			BulletThread bulletThread = null;
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '\n') {
					if(bulletThread == null || !bulletThread.isAlive()) {
						bulletThread = new BulletThread(bulletLabel, targetLabel, targetThread);
						bulletThread.start();
					}
				}
			}
		});
	}
	
	class TargetThread extends Thread{
		JComponent target;
		public TargetThread(JComponent target) {
			this.target = target;
			target.setLocation(0, 0);
		}
		public void run() {
			while(true) {
				int x = target.getX() + 5;
				int y = target.getY();
				if(x > GamePanel.this.getWidth()) {
					target.setLocation(0, 0);
				}else {
					target.setLocation(x, y);
				}try {
					sleep(20);
				}catch(InterruptedException e) {
					target.setLocation(0, 0);
					try {
						sleep(500);
					}catch(InterruptedException e2) {
						
					}
				}
			}
		}
	}

	class BulletThread extends Thread{
		JComponent bullet, target;
		Thread targetThread;
		public BulletThread(JComponent b, JComponent t, Thread targetThread) {
			this.bullet = b;
			this.target = t;
			this.targetThread = targetThread;
		}
		public void run() {
			while(true) {
				if(hit()) {
					targetThread.interrupt();
					bullet.setLocation(bullet.getParent().getWidth() / 2-5,
							bullet.getParent().getHeight() - 50);
					return;
				}else {
					int x = bullet.getX();
					int y = bullet.getY() - 5;
					if(y < 0) {
						bullet.setLocation(bullet.getParent().getWidth() / 2-5,
								bullet.getParent().getHeight() - 50);
						return;
					}
					bullet.setLocation(x, y);
				}
				try {
					sleep(20);
				}catch(InterruptedException e) {
					
				}
			}
		}
		public boolean hit() {
			int bulletX = bullet.getX();
			int bulletY = bullet.getY();
			int bulletW = bullet.getWidth();
			int bulletH = bullet.getHeight();
			if(contains(bulletX, bulletY) || contains(bulletX + bulletW -1, bulletY) ||
					contains(bulletX + bulletW - 1, bulletY + bulletH - 1) ||
					contains(bulletX, bulletY + bulletH - 1)) {
				return true;
			}else {
				return false;
			}
		}
		private boolean contains(int x, int y) {
			if(((target.getX() <= x) && (x < target.getX() + target.getWidth())) &&
					((target.getY() <= y) && (y < target.getY() + target.getHeight()))) {
				return true;
			}else {
				return false;
			}
		}
	}
}