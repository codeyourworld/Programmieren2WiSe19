package simpleThreadExample;

//TODO 1) von Thread erben
public class MyFirstThread extends Thread {
	
	private String text;
	
	
	public MyFirstThread(String text) {
		this.text = text;
	}


	//TODO 2) die run()-Methode �berschreiben.
	//In der run()-Methode steht all das was der Thread nebenl�ufig tun soll.
	@Override
	public void run() {
		System.out.println(text);		
	}

}
