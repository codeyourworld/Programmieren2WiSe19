package aufgabe2.a5;

import java.util.ArrayList;
import java.util.Collections;

public class MovieMain {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new Movie("LAST CHRISTMAS", "In London spielende, romantische Kom�die inspiriert von George Michaels gleichnamigem Hit.\r\n" + 
				"Kate (Emilia Clarke) trifft irgendwie immer die falschen Entscheidungen und stolpert dadurch von einem Chaos ins n�chste. "
				+ "Dabei ist doch gerade Vorweihnachtszeit und �berall in London blinken die Lichterketten. "
				+ "Aber auch ihr Job als Weihnachts-Elf bringt Kate kein Gl�ck.\r\n" + 
				"\r\nDoch dann trifft sie unverhofft auf Tom (Henry Golding), der schnell ihr Vertrauen gewinnt und ihr neue Lebensfreude schenkt. "
				+ "Ihm gelingt es sogar, ihre selbstgebauten Barrieren zu durchbrechen. Alles scheint perfekt, doch offensichtlich hat auch "
				+ "Tom ein Geheimnis ...", 103, "7.1", "Kom�die"));
		
		movies.add(new Movie("LE MANS 66 - GEGEN JEDE CHANCE", "Ford gegen Ferrari: Spannendes Rennfahrer-Drama mit Matt Damon und Christian Bale, "
				+ "die im Film das 24-Stunden-Rennen von Le Mans 1966 gewinnen wollen.\r\n\r\nUm im Rennsport erfolgreich zu sein, "
				+ "musst du Visionen haben. So wendet sich der amerikanische Sportwagenhersteller Carroll Shelby (Matt Damon) an den in "
				+ "Gro�britannien geborenen Rennfahrer Ken Mikes (Christian Bale), um mit ihm ein Auto zu entwickeln, "
				+ "das den dominierenden Konkurrenten Ferrari beim 24-Stunden-Rennen von Le Mans in Frankreich schlagen kann. \r\n\r\n" + 
				"Doch ein sich st�ndig einmischender Auftraggeber, die Gesetze der Physik und auch private Probleme erschweren es dem Duo, "
				+ "einen revolution�ren Rennwagen auf die Strecke zu bringen. Und die Zeit bis zum Wettkampf wird immer "
				+ "knapper ...", 153, "7.58", "Drama"));
		
		movies.add(new Movie("ZOMBIELAND 2: DOPPELT H�LT BESSER", "Fortsetzung der Zombie-Kom�die mit Woody Harrelson, Jesse Eisenberg, "
				+ "Abigail Breslin und Emma Stone.\r\n\r\nDie Welt liegt nach der Zombie-Apokalypse brach. "
				+ "Sogar das Wei�e Haus ist v�llig ausgestorben und bietet den vier Zombie-Killern Tallahassee (Woody Harrelson), "
				+ "Wichita (Emma Stone), Little Rock (Abigail Breslin) und Columbus (Jesse Eisenberg) einen willkommenen Unterschlupf.\r\n\r\n" + 
				"Doch bald bekommen sie es mit v�llig neuen Zombie-Arten zu tun, die sie vor eine ungeahnte Herausforderung stellen. "
				+ "Und nicht nur die Untoten machen ihnen das Leben schwer, sondern auch ein paar andere menschliche �berlebende, "
				+ "die erstaunliche Parallelen zu ihrer eigenen kleinen Chaos-Truppe aufweisen.", 99, "7.4", "Action"));
		
		movies.add(new Movie("DAS PERFEKTE GEHEIMNIS", "Deutsche Kom�die mit Florian David Fitz, Elyas M'Barek und Karoline Herfurth �ber eine "
				+ "Gruppe von Freunden, deren Geheimnisse bei einem Abendessen auf den Tisch kommen.\r\n\r\nEin Abendessen zwischen sieben "
				+ "Freunden nimmt einen spannenden Verlauf: Als in der Runde �ber das Thema Ehrlichkeit diskutiert wird, beschlie�en die "
				+ "Anwesenden ein gewagtes Spiel. Alle Smartphones werden auf den Tisch gelegt, und alle Nachrichten und Anrufe, die reinkommen, "
				+ "werden offen vorgelesen und mitgeh�rt.\r\n\r\nWas als harmloser Spa� beginnt, endet bald in Offenbarungen, "
				+ "mit denen niemand gerechnet h�tte. Denn so gut, wie sie dachten, kennen sich die Freunde gar nicht und es gibt jede Menge "
				+ "Geheimnisse, die pl�tzlich ans Licht kommen ...", 111, "6.97", "Kom�die"));
		
		Collections.sort(movies);

		for (Movie movie: movies) {
			System.out.println(movie);
		}
	}
}
