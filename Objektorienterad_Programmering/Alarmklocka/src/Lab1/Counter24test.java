package Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Counter24Test {

	@Test
	public void testingCounter() {
		Counter24 myCounter = new Counter24();
		
		assertEquals(0, myCounter.getCount());
		myCounter.count();

		assertEquals(1, myCounter.getCount());
		myCounter.count();
		
		assertEquals(2, myCounter.getCount());

	}

}