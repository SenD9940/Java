import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.Random;
public class MyFrame extends JFrame implements Runnable{
	Thread th;
	@Override
	public void run() {
		Random random = new Random();
		while(true) {
			int x = this.getX() + random.nextInt()%5;
			int y = this.getY() + random.nextInt()%5;
			this.setLocation(x, y);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				System.out.println(e);
				return;
			}
		}
	}
	
	public MyFrame() {
		this.setTitle("Vibrator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.addMouseListener(new MouseAdapter() {
			 public void mousePressed(MouseEvent e) {
				 if(!th.isAlive()) {
					 return;
				 }
				 th.interrupt();
			 }
		});
		this.setSize(250, 250);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
		th = new Thread(this);
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
