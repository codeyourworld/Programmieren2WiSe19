package synchronizedExample;

public class CatFeeder extends Thread {

	private Cat cat;
	private String name;
	private boolean isRunning = true;
	
	public CatFeeder(Cat cat, String name) {
		this.cat = cat;
		this.name = name;
	}

	@Override
	public void run() {
		
		while(isRunning) {
			System.out.println(name + ": Want to feed the cat");
			cat.feed();
			System.out.println(name + ": Finished. Garfield was happy!");
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
