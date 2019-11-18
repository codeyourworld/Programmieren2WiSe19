package waitAndNotify;

public class Minion extends Thread {

	private String name;
	private boolean isRunning = true;
	private Banana banana;

	public Minion(String name, Banana banana) {
		this.name = name;
		this.banana = banana;
	}


	@Override
	public void run() {

		while(isRunning) {
			try {
				
				synchronized (banana) {
					System.out.println(name + ": Ich warte auf meinen nächsten Auftrag");
					banana.wait();
					System.out.println("Yeahhh, die Langeweile ist vorbei...");					
				}
				work();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	
	private void work() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void stopThread() {
		isRunning = false;
	}
	
}
