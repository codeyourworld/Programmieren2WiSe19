package KlassenKrashKurs;

public class Mensch extends Tier{
	float nasenlange;
	String name;
	
	public Mensch(String name, float nasenlange) {
		super();
		this.nasenlange = nasenlange;
		this.name = name;
	}
	
	public float getNasenlange() {
		return nasenlange;
	}

	public void setNasenlange(float nasenlange) {
		this.nasenlange = nasenlange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
