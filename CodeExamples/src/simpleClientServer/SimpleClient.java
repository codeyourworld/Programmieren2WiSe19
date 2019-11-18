package simpleClientServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {

	private String ipAddress = "localhost";
	private int port = 1234;
	
	public SimpleClient(String ipAddress, int port) {
		this.ipAddress = ipAddress;
		this.port = port;
	}
	
	public void start() {
		
		try {
			//Erstellt eine TCP/IP-Verbindung zum Server mit der angegebenen IP-Adresse und dem Port. 
			//Achtung, der Port muss der gleiche sein!
			Socket socket = new Socket(ipAddress, port);

			//Lies eine Nachricht und gib sie auf der Konsole aus
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = bufferedReader.readLine();
			System.out.println(message);

			//Schreibe eine Nachricht an den Server
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.println("Client schreibt: Hallo Server, ich wollte dir nur einen schönen Tag wünschen.");
			printWriter.flush();

			//Schließe alle Reader/Writer, Socket
			bufferedReader.close();
			printWriter.close();
			socket.close();

			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
