package intlist_wet_2021_2022;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test() {
		IntList myIntList = new IntList();
		assertArrayEquals(new int[0], myIntList.getElements());
		assertEquals(0, myIntList.getLength());
		
		myIntList.add(10);
		myIntList.add(20);
		myIntList.add(30);
		assertArrayEquals(new int[] {10, 20, 30}, myIntList.getElements());
		assertEquals(3, myIntList.getLength());
		assertEquals(10, myIntList.getElementAt(0));
		assertEquals(20, myIntList.getElementAt(1));
		assertEquals(30, myIntList.getElementAt(2));
		
	}

}
