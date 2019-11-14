package threads;

import java.util.concurrent.LinkedBlockingQueue;

public class Consumer extends Thread {
	
	private LinkedBlockingQueue<Bread> breads;

	public Consumer(LinkedBlockingQueue<Bread> breads) {
		this.breads = breads;
	}

	@Override
	public void run() {
		super.run();
		
		while(true) {
			try {
				Bread bread = breads.take();
				System.out.println(bread);
				Thread.sleep(600000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	
	
}
