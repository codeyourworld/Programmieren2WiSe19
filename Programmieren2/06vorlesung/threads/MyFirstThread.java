package threads;

public class MyFirstThread implements Runnable {//extends Thread {
	
	private int start;
	private int end;
	
	public MyFirstThread(int start, int end) {
		this.end = end;
		this.start = start;
	}
	
	@Override
	public void run() {
		
		for(int i = start; i < end; i++) {
			System.out.println(i);

			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		MyFirstThread thread = new MyFirstThread(0, 100);
		MyFirstThread thread2 = new MyFirstThread(101, 200);
		Thread myThread = new Thread(thread); 
		Thread myThread2 = new Thread(thread2);
		myThread.start();
		myThread2.start();
	}
}
