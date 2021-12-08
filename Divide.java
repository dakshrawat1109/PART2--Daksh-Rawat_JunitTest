package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Divide {

	@Test
	void test() {
		JunitTesting test= new JunitTesting();
		 assertAll(
		            () -> assertEquals(1, test.divide(1,1), "two positive numbers properly divide"),
		            () -> assertEquals(-1, test.divide(-1,1), "a negative and a positive number properly divides"),
		            () -> assertEquals(1, test.divide(-1,-1), "two negative number properly")
		          
		        );
	}

}
