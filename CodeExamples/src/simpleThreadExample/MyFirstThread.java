package simpleThreadExample;

//TODO 1) von Thread erben
public class MyFirstThread extends Thread {
	
	private String text;
	
	
	public MyFirstThread(String text) {
		this.text = text;
	}


	//TODO 2) die run()-Methode überschreiben.
	//In der run()-Methode steht all das was der Thread nebenläufig tun soll.
	@Override
	public void run() {
		System.out.println(text);		
	}

}
