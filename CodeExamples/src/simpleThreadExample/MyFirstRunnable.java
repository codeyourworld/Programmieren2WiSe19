package simpleThreadExample;

//TODO 1) das Interface Runnable implementieren
public class MyFirstRunnable implements Runnable {

	private String text;

	
	public MyFirstRunnable(String text) {
		this.text = text;
	}


	//TODO 2) die run()-Methode überschreiben.
	//In der run()-Methode steht all das was der Thread nebenläufig tun soll.
	@Override
	public void run() {
		System.out.println(text);			
	}

}
