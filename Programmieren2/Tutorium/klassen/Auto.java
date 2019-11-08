package klassen;

//public = von überall darauf zu greifbar
//private = nur innerhalb der Klasse zugreifbar
public class Auto {
	private String farbe = "";
	private String model = "";
	
	public Auto() {
		farbe = "Schwarz";
		model = "VW Käfer";
	}

	public Auto(String farbe, String model) {
		this.farbe = farbe;
		this.model = model;
	}

	/**
	 * @return the farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	
}
