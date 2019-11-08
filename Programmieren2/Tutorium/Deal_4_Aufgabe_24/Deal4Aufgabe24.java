package Deal_4_Aufgabe_24;
import java.util.Scanner;

public class Deal4Aufgabe24 {
	public static void main(String[] args) {
		
		Film film1 = new Film("Deadpool","war lustig",2.5f,8);
		Film film2 = new Film("Deadpool 2","war fast lustig",2.5f,7);
		Film film3 = new Film("Taxi Driver","war garnicht lustig",2.5f,10);
		Film film4 = new Film("Programmieren 2: rache der Integer","war gruselig",2.5f,0);
		
		
		Film[] liste = new Film[4];
		
		liste[0]=film1;
		liste[1]=film2;
		liste[2]=film3;
		liste[3]=film4;
		
		/*for (int i=0; i<liste.length;i++) {
			System.out.println("Film["+i+"] : "+liste[i].titel);
		}*/
		
		for ( Film film : liste) {
			System.out.println(film.titel);
		}
		
		System.out.println("Zu welchen film willstu mehr infos haben?");
		Scanner input = new Scanner(System.in);
		int auswahl = input.nextInt();
		
		liste[auswahl].printInfos();
		
		
		
		
		
	}
}
