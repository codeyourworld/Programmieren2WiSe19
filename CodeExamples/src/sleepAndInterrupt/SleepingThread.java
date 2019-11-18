package sleepAndInterrupt;

public class SleepingThread extends Thread {

	private int time;
	private boolean isRunning = true;

	public SleepingThread(int time) {
		this.time = time;
	}
	

	@Override
	public void run() {
		
		while(isRunning) {
			try {
				Thread.sleep(time);
				System.out.println("...");
			} catch (InterruptedException e) {
				System.out.println("Wer wagt es meinen schönen Schlaf zu unterbrechen???");
	
			}
		}
		
	}
	
	public void stopThread() {
		isRunning = false;
	}
	
}
