package mathematics;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

	@Test
	void test() {
        PrimeFactors pf= new PrimeFactors();
		assertEquals(pf.printPrimeFactors(12).toString(),"2 2 3 ");
		assertEquals(pf.printPrimeFactors(13).toString(),"13 ");
		assertEquals(pf.printPrimeFactors(315).toString(),"3 3 5 7 ");
		assertEquals(pf.printPrimeFactors(450).toString(),"2 3 3 5 5 ");

	
	}

}
