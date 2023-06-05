import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class VibrationFrame extends JFrame{
	public VibrationFrame() {
		this.setTitle("진동 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250, 200);
		this.setVisible(true);
		Thread th = new Thread(new MyThread(this));
		th.start();
	}
}

public class ThreadEx4{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VibrationFrame();
	}
}

class MyThread implements Runnable{
	VibrationFrame vf;
	boolean flag = false;
	int cnt = 0;
	
	public MyThread(VibrationFrame vf) {
		this.vf = vf;
	}
	
	public void run() {
		while(cnt++ < 10000) {
			System.out.println(cnt);
			if(flag) {
				vf.setLocation(vf.getLocation().x + 3, vf.getLocation().y + 3);
				flag = false;
			}else {
				vf.setLocation(vf.getLocation().x - 3, vf.getLocation().y - 3);
				flag = true;
			}
		}
	}
}