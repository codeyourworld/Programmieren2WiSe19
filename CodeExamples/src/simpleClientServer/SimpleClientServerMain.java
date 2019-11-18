package simpleClientServer;


public class SimpleClientServerMain {

	public static void main(String[] args) {

		/*
		 * Achtung, normalerweise hat sowohl der Server als auch der Client eine eigene main-Methode. 
		 * Beide laufen ja auf unterschiedlichen Rechnern.
		 * Dann muss zu erst der Server und dann der Client gestartet werden.
		 * 
		 * Wichtig:
		 * Wenn noch Instanzen von Client und / oder Server laufen, dann bekommt ihr eine BindException.
		 * 
		 */
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				SimpleServer server = new SimpleServer(3242, 1);
				server.start();
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				SimpleClient client = new SimpleClient("localhost", 3242);
				client.start();
			}
		}).start();
		
	}
	
}
