package GelinkteLijsten;

/**
 * Een wachtrij (queue) werkt via het 
 * first-in first-out principe; elementen worden toegevoegd 
 * aan de achterkant en worden verwijderd aan de voorkant.
 * 
 * In deze klasse implementeer je een Queue door alleen 
 * maar gebruik te maken van de opslagmethode die de 
 * klasse GelinkteLijst je biedt. De Node komt niet voor in deze klasse!
 * 
 * In [Hubbard, hoofdstuk 6] wordt de Queue besproken.
 * 
 * @author Youri 
 *
 */
public class Wachtrij {
	
	GelinkteLijst lijst;
	
	public Wachtrij() {
		lijst = new GelinkteLijst();
		
	}
	
	/**
	 * Zet iets in de wachtrij
	 * aan de achterkant: FIFO
	 */
	void enqueue(Object o) {
		lijst.insertFirst(o); //bijvoorbeeld zo	
	}
	
	/**
	 * Haal iets van de wachtrij
	 * Aan de voorkant: FIFO
	 */
	Object dequeue() {return null;}
	
	/**
	 * Het aantal elementen in de wachtrij
	 * @return
	 */
	int size() {return 0;}
	
	/**
	 * Is de lijst leeg?
	 * @return
	 */
	boolean isEmpty() {return false;}
	
	/**
	 * Bekijk het eerste element in de wachtrij, 
	 * maar haalt het niet er vanaf. 
	 * Note: het eerste element is als eerste toegevoegd.
	 * @return
	 */	
	Object front() {return new Object();}
}
