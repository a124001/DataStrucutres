package mathematics;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial f = new Factorial();
		assertEquals(24, f.getFactorial(4));
		assertEquals(720, f.getFactorial(6));
        assertEquals(1, f.getFactorial(0));

        assertEquals(24, f.getFactorialWithRecursion(4));
		assertEquals(720, f.getFactorialWithRecursion(6));
        assertEquals(1, f.getFactorialWithRecursion(0));

	}

}
