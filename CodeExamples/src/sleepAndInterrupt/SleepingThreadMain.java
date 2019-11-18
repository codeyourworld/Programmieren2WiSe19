package sleepAndInterrupt;

public class SleepingThreadMain {

	public static void main(String[] args) {
		SleepingThread thread = new SleepingThread(1000);
		thread.start();
		
		for (int i = 0; i < 4; i++) {
			try {
				//warte 0, 550, 1100, 1650 ms
				Thread.sleep(i*550);
				
				//weck den Thread auf; interrupt unterbricht das Schlafen
				thread.interrupt();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		thread.stopThread();
		
	}
}
