package synchronizedExample;

public class Cat {
	
	private int feedCount = 0;
	
	public synchronized void feed() {
		feedCount++;
		
		//simulate the time for eating
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Ohhh it was soooo delicious :)");
	}
	
	public synchronized int getFeedCount() {
		return feedCount;
	}

}
