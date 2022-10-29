package mathematics;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTrailingZerosTest {

	@Test
	void test() {
		FactorialTrailingZeros factorialTrailingZeros=new FactorialTrailingZeros();
		assertEquals(factorialTrailingZeros.getTrailingZeros(10),2);
		assertEquals(factorialTrailingZeros.getTrailingZerosEfficient(10),2);
		factorialTrailingZeros.getTrailingZerosEfficient(200);
	}

}
