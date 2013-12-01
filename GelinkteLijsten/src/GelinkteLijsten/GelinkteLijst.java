package GelinkteLijsten;

public class GelinkteLijst {
	
	
	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		//Dit is de data die je opslaat
		Object data;
		
		// referenties/pijlen naar de volgende en vorige nodes
		Node next;
	}	
	
	
	private Node head;
	private int size;
	
	
	public GelinkteLijst() {
	}
	
	
	Object getFirst() {
		return head.data;
	}
	
	
	Object getLast() {
		return null; // dummy
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object o) {}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o) {}
	
	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object o, Object before) {}
	
	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object o, Object after) {}

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data) {}
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isFirst(Node current) {
		return false; //dummy
	}
	
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isLast(Node current) {
		return false; //dummy	
	}
	
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * @return
	 */
	int getSize() {
		return size;
	}
}
