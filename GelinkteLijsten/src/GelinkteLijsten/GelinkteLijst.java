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
		size = 0;
	}
	
	
	Object getFirst() {
		return head.data;
	}
	
	
	Object getLast() {
		Node i = head;
		while(i.next != null) { i = i.next; } 
		return i.data;
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object o) {
		Node insertNode = new Node();
		insertNode.data = o;
		
		if (head != null) {
			insertNode.next = head;
		}
		
		head = insertNode;
		size++;
	}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o) {
		Node insertNode = new Node();
		insertNode.data = o;
		
		Node i = head;
		while(i.next != null) { i = i.next; }
		
		i.next = insertNode;
		
		size++;
	}
	
	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object o, Object before) {
		Node insertNode = new Node();
		insertNode.data = o;
		
		Node i = head;
		while(i.next != null) {
			
			if (i.next.equals(before)) {
				insertNode.next = i.next;
				i.next = insertNode;
				size++;
				break;
			}
			i = i.next;
		}
	}
	
	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object o, Object after) {
		Node insertNode = new Node();
		insertNode.data = o;
		
		Node i = head;
		while(i.next != null) {
			
			if (i.equals(after)) {
				insertNode.next = i.next;
				i.next = insertNode;
				size++;
				break;
			}
			i = i.next;
		}
	}

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data) {
		Node i = head;
		while (!i.next.data.equals(data)) { i = i.next; }
		i.next = i.next.next;
	}
	
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
