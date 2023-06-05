import java.lang.*;

class TimerThread extends Thread{
	private int timer;
	public TimerThread(int timer) {
		this.timer = timer;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(timer);
			try {
				sleep(timer);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

class Timer{
	private int timer;
	public Timer(int timer) {
		this.timer = timer;
	}
	public void start() {
		while(true) {
			System.out.println(timer);
			try {
				synchronized (this) {
					this.wait(timer);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerThread t500 = new TimerThread(500);
		Timer t = new Timer(1000);
		t500.start();
		t.start();
	}
}
