package simpleClientServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	private int port;
	private int noOfClientConnections;

	public SimpleServer(int port, int noOfClientConnections) {
		this.port = port;
		this.noOfClientConnections = noOfClientConnections;
	}

	public void start() {
		
		try {
			//horcht auf den Port und l‰sst 100 Client Verbindungen zu
			ServerSocket serverSocket = new ServerSocket(port, noOfClientConnections);

			//wartet darauf dass sich ein Client verbindet
			System.out.println("Server: Warte auf eine Verbindung...");
			Socket socket = serverSocket.accept();
			
			//Schreibe eine Nachricht an den Client
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.println("Server schreibt: Verbindung erfolgreich aufgebaut.");
			printWriter.flush();

			//Lies eine Nachricht und gib sie auf der Konsole aus
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = bufferedReader.readLine();
			System.out.println(message);

			//Schlieﬂe alle Reader/Writer, Sockets
			bufferedReader.close();
			printWriter.close();
			socket.close();
			serverSocket.close();
			
			System.out.println("Server: Auf Wiedersehen!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
