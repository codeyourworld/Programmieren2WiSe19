package Deal_4_Aufgabe_24;

public class Film {
	String titel;
	String filmInfos;
	float filmLange;
	int bewertung;

	public Film() {
	}

	public Film(String titel, String filmInfos, float filmLange, int bewertung) {
		super();
		this.titel = titel;
		this.filmInfos = filmInfos;
		this.filmLange = filmLange;
		this.bewertung = bewertung;
	}
	
	public void printInfos() {
		System.out.println("Titel: "+titel+"\nfilmInfos: "+filmInfos+"\nfilmLänge: "+filmLange+"\nbewertung: "+bewertung);
	}

}
