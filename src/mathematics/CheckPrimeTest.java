package mathematics;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckPrimeTest {

	@Test
	void test() {
		CheckPrime cp=new CheckPrime();
		
		assertTrue(cp.checkPrime(13));
		assertFalse(cp.checkPrime(14));
		assertTrue(cp.checkPrime(101));

		assertTrue(cp.checkPrimeWithSqRoot(13));
		assertFalse(cp.checkPrimeWithSqRoot(14));
		assertTrue(cp.checkPrimeWithSqRoot(101));

		
		
	}

}
