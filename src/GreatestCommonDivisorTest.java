import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {

	@Test
	void test() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		assertEquals(gcd.getGCD(4, 6), 2);
		assertEquals(gcd.getGCD(100, 200), 100);
		assertEquals(gcd.getGCD(7, 13), 1);
		
		assertEquals(gcd.getEuclideanGCD(4, 6), 2);
		assertEquals(gcd.getEuclideanGCD(100, 200), 100);
		assertEquals(gcd.getEuclideanGCD(7, 13), 1);


	}

}
