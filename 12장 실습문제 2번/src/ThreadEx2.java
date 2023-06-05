import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadEx2 extends JFrame{
	JLabel label;
	TimerThread th = null;
	public ThreadEx2() {
		this.setTitle("디지털 타이머");
		this.setSize(300, 160);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel();
		label.setFont(new Font("Gothic", Font.BOLD, 80));
		this.setLayout(new FlowLayout());
		th = new TimerThread(label);
		label.requestFocus();
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(th.isAlive()) {
					th.interrupt();
				}else {
					th = new TimerThread(label);
					th.start();
				}
			}
		});
		this.add(label);
		this.setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadEx2();
	}
}

class TimerThread extends Thread{
	JLabel label;
	int counter = 0;
	public TimerThread(JLabel label) {
		this.label = label;
	}
	public void run() {
		while(true) {
			label.setText(String.format("%d", counter++));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				counter = 0;
				return;
			}
		}
	}
}