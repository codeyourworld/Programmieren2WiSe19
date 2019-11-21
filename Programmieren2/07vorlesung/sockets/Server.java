package sockets;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public void startServer() {
		
		try {
			//horche auf den Port 2344 und nimm eine Client Verbindung an
			ServerSocket serverSocket = new ServerSocket(2344, 1);
			
			//warte darauf, dass sich ein Client mit dem Server verbindet
			Socket socket = serverSocket.accept();
			System.out.println("Verbindung mit client hergestellt");
			
			//empfange eine Nachricht
			Scanner input = new Scanner(socket.getInputStream());
			String message = input.nextLine();
			System.out.println(message);

			//sende eine Nachricht
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println("Google du Lappen");
			writer.flush();
			
			//schlieﬂe alle reader/writer/streams
			input.close();
			writer.close();
			socket.close();
			serverSocket.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.startServer();
	}
	
}
