import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class ThreadEx3 extends JFrame{
	JLabel label;
	public ThreadEx3() {
		this.setTitle("디지털 시계");
		this.setSize(500, 160);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel();
		label.setFont(new Font("Gothic", Font.BOLD, 80));
		this.setLayout(new FlowLayout());
		this.add(label);
		Clock c = new Clock(label);
		this.setVisible(true);
		c.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadEx3();
	}
}


class Clock extends Thread{
	JLabel label;
	int h, m, s;
	public Clock(JLabel label) {
		this.label = label;
	}
	public void run() {
		while(true) {
			Calendar c = Calendar.getInstance();
			h = c.get(Calendar.HOUR_OF_DAY);
			m = c.get(Calendar.MINUTE);
			s = c.get(Calendar.SECOND);
			label.setText(String.format("%02d:%02d:%02d", h, m, s));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}