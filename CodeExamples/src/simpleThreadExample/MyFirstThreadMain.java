package simpleThreadExample;

public class MyFirstThreadMain {

	public static void main(String[] args) {
		MyFirstThread thread = new MyFirstThread("Hallo");
		
		//Mit start() wird die run()-Methode des Threads aufgerufen
		thread.start();
	}
	
}
