package intlist_wet_2021_2022;

import java.util.Arrays;

public class IntList {
	/**
	 * @invar | elements != null
	 * 
	 * @representationObject
	 */
	private int[] elements;
	
	/**
	 * @post | result != null
	 * 
	 * @creates | result
	 */
	public int[] getElements() { return elements.clone(); }
	
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() { return elements.length; }
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 * 
	 * @inspects | this
	 */
	public int getElementAt(int index) { return elements[index]; }
	
	/**
	 * @post | getLength() == 0
	 */
	public IntList() {
		elements = new int[0];
	}

	/**
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == value
	 * @post | Arrays.equals(old(getElements()), 0, old(getLength()), getElements(), 0, old(getLength()))
	 * 
	 * @mutates | this
	 */
	public void add(int value) {
		int[] newElements = new int[elements.length + 1];
		System.arraycopy(elements, 0, newElements, 0, elements.length);
		newElements[elements.length] = value;
		elements = newElements;
	}
	
	/**
	 * @pre | getLength() > 0
	 * 
	 * @post | getLength() == old(getLength()) - 1
	 * @post | Arrays.equals(old(getElements()), 0, getLength(), getElements(), 0, getLength())
	 * 
	 * @mutates | this
	 */
	public void removeLast() {
		int[] newElements = new int[elements.length - 1];
		System.arraycopy(elements, 0, newElements, 0, newElements.length);
		elements = newElements;
	}
}
