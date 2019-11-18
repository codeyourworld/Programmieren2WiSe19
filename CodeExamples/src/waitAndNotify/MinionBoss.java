package waitAndNotify;

public class MinionBoss extends Thread {

	private boolean isRunning = true;
	private Banana banana;

	public MinionBoss(Banana banana) {
		this.banana = banana;
	}

	@Override
	public void run() {
		while (isRunning) {

			synchronized (banana) {
				System.out.println("Minionboss: Ich habe einen neuen Auftrag bekommen");
				banana.notify();				
			}

			doSomethingElse();

		}
	}
	
	public void stopThread() {
		isRunning = false;
	}


	private void doSomethingElse() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
