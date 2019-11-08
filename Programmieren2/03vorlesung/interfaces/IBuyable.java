package interfaces;

/**
 * Info zu Interfaces
 * <br><br>
 * Interfaces benutzt man, wenn man Eigenschaften f�r Klassen definieren m�chte, 
 * die nichts miteinander zu tun haben.
 * Eine Klasse kann beliebig viele Interfaces implementieren.
 * <br>
 * Das Handling eines Interfaces ist �hnlich wie das einer abstrakten Klasse.
 * 
 * @author Stephi
 * @version 1.0
 */
public interface IBuyable {

	/**
	 * 
	 * @return gibt den Preis des Objekts zur�ck
	 */
	public double price();

}
