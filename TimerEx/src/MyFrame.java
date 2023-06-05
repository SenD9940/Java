import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Timer extends Thread{
	private int n = 0;
	private JLabel timer_label;
	
	public Timer(JLabel timer_label) {
		this.timer_label = timer_label;
	}
	
	@Override
	public void run() {
		while(true) {
			timer_label.setText(String.valueOf(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
				return;
			}
		}
	}
}


public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("TIMER");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel timer_label = new JLabel();
		timer_label.setFont(new Font("Arial", Font.BOLD, 100));
		cp.add(timer_label);
		
		this.setSize(250, 150);
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setVisible(true);
		
		Timer t = new Timer(timer_label);
		t.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myframe = new MyFrame();
	}

}
