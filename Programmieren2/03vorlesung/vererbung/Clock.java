package vererbung;

/**
 * Infos zu abstrakten Klassen
 * <br><br>
 * Clock ist eine abstrakte Klasse, was man an dem Klassen Header "public abstract class Clock" erkennt.
 * Immer wenn eine Klasse eine abstrakte Methode enthält wie hier z.B. public abstract void tic(), 
 * dann muss auch die Klasse abstrakt sein.
 * 
 * Bei abstrakten Methoden hat man nur den Methodenkopf wie public abstract void tic(); 
 * Es gibt also keinen Body. 
 * 
 * Eine Klasse, die von einer abstrakten Klasse erbt, muss entweder alle 
 * abstrakten Methoden implementierenoder auch abstrakt sein.
 * 
 * 
 * @author Stephi
 * @version 1.0
 *
 */
public abstract class Clock {
	
	private String time;

	public abstract void tic();
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
