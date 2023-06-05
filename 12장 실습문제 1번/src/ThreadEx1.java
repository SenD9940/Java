class CountingThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	
}

public class ThreadEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(new CountingThread());
		th.start();
		System.out.println("After Starting Thread");
		try {
			th.join();
		}catch(InterruptedException e) {
			return;
		}
		System.out.println("After Join");
	}

}
