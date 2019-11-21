package sockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class Client {

	public void startClient() {
		
		try {
			
			Socket socket = new Socket("localhost", 2344);
			
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));
			
			writer.write("Sag mal wie das Wetter morgen wird");
			writer.newLine();
			writer.flush();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));

			new Thread(new Runnable() {
				
				@Override
				public void run() {

					try {
						String message = reader.readLine();
						System.out.println(message);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}).start();
			
			writer.close();
			reader.close();
			socket.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.startClient();
	}
}
