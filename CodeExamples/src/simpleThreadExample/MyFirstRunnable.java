package simpleThreadExample;

//TODO 1) das Interface Runnable implementieren
public class MyFirstRunnable implements Runnable {

	private String text;

	
	public MyFirstRunnable(String text) {
		this.text = text;
	}


	//TODO 2) die run()-Methode �berschreiben.
	//In der run()-Methode steht all das was der Thread nebenl�ufig tun soll.
	@Override
	public void run() {
		System.out.println(text);			
	}

}
