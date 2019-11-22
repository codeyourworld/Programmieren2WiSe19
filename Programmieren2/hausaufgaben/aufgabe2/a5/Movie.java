package aufgabe2.a5;

public class Movie implements Comparable<Movie>{

	private String titel;
	private String info;
	private float lenght;
	private String rating;
	private String genre;
	
	public Movie(String titel, String info, float lenght, String rating, String genre) {
		super();
		this.titel = titel;
		this.info = info;
		this.lenght = lenght;
		this.rating = rating;
		this.genre = genre;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int compareTo(Movie o) {
		return titel.compareTo(o.titel);
	}
	
	@Override
	public String toString() {
		return titel + " (" + rating + ")\n" + genre + "\n--------------------\n"  + info + "\n(" + lenght + " min)\n\n";
	}
	
}
