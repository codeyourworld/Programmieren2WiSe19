package waitAndNotify;

public class MinionMain {

	public static void main(String[] args) {

		Banana banana = new Banana("Bananaaaaa");
		Minion minion = new Minion("Minion", banana);
		MinionBoss boss = new MinionBoss(banana);
		
		minion.start();
		boss.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		minion.stopThread();
		boss.stopThread();
		
	}

}
