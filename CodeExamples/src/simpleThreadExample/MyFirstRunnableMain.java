package simpleThreadExample;

public class MyFirstRunnableMain {

	public static void main(String[] args) {
		MyFirstRunnable runnable = new MyFirstRunnable("Huhu");
		
		//Um threadspezifische Methoden wie start(), join() etc nutzen zu können, muss das Runnable-Objekt eine Thread-Hülle bekommen
		Thread thread = new Thread(runnable);

		//Mit start() wird die run()-Methode des Threads aufgerufen
		thread.start();

	}

}
