package intlist_wet_2021_2022;

import java.util.Arrays;

public class IntList {
	
	/**
	 * @post | result != null
	 * 
	 * @creates | result
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | getLength() == 0
	 */
	public IntList() { throw new RuntimeException("Not yet implemented"); }

	/**
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == value
	 * @post | Arrays.equals(old(getElements()), 0, old(getLength()), getElements(), 0, old(getLength()))
	 */
	public void add(int value) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | getLength() > 0
	 * 
	 * @post | getLength() == old(getLength()) - 1
	 * @post | Arrays.equals(old(getElements()), 0, getLength(), getElements(), 0, getLength())
	 */
	public void removeLast() { throw new RuntimeException("Not yet implemented"); }
}
