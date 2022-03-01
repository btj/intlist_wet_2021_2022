package intlist_wet_2021_2022;

import java.util.Arrays;

public class IntList {
	
	private class Node {
		private int value;
		/**
		 * @peerObject
		 */
		private Node next;
		
		private Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	/**
	 * Returns the index of x in the linked list starting at y.
	 */
	private int earliestOccurrence(Node x, Node y) {
		if (x == y)
			return 0;
		return 1 + earliestOccurrence(x, y.next);
	}
	
	private boolean hasCycles(Node head, int i, Node x) {
		if (x == null)
			return false;
		if (earliestOccurrence(x, head) < i)
			return true;
		return hasCycles(head, i + 1, x.next);
	}
	
	/**
	 * @invar | !hasCycles(head, 0, head)
	 * 
	 * @representationObject
	 */
	private Node head;
	
	private int getLengthPrivate(Node n) {
		return n == null ? 0 : 1 + getLengthPrivate(n.next);
	}
	
	/**
	 * @post | result != null
	 * 
	 * @creates | result
	 */
	public int[] getElements() {
		int[] result = new int[getLengthPrivate(head)];
		Node n = head;
		for (int i = 0; i < result.length; i++) {
			result[i] = n.value;
			n = n.next;
		}
		return result;
	}
	
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() {
		return getLengthPrivate(head);
	}
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) {
		Node n = head;
		for (int i = 0; i < index; i++)
			n = n.next;
		return n.value;
	}
	
	/**
	 * @post | getLength() == 0
	 */
	public IntList() {}

	/**
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == value
	 * @post | Arrays.equals(old(getElements()), 0, old(getLength()), getElements(), 0, old(getLength()))
	 */
	public void add(int value) {
		if (head == null)
			head = new Node(value, null);
		else {
			Node n = head;
			while (n.next != null)
				n = n.next;
			n.next = new Node(value, null);
		}
	}
	
	/**
	 * @pre | getLength() > 0
	 * 
	 * @post | getLength() == old(getLength()) - 1
	 * @post | Arrays.equals(old(getElements()), 0, getLength(), getElements(), 0, getLength())
	 */
	public void removeLast() {
		if (head.next == null)
			head = null;
		else {
			Node n = head;
			while (n.next.next != null)
				n = n.next;
			n.next = null;
		}
	}
}
