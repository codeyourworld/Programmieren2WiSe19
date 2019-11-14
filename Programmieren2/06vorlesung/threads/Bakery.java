package threads;

import java.util.concurrent.LinkedBlockingQueue;

public class Bakery extends Thread {
	
	private LinkedBlockingQueue<Bread> breads;
	
	public Bakery(LinkedBlockingQueue<Bread> breads) {
		this.breads = breads;
	}

	@Override
	public void run() {
		super.run();

		while(true) {
			try {
				Thread.sleep(100);
				breads.put(new Bread("cooles Brot", 100));
				System.out.println("Habe ein Brot produziert.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}		
	}
	
}
