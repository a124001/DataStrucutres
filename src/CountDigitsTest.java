import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountDigitsTest {

	@Test
	void test() {
		CountDigits countDigits = new CountDigits();
        assertEquals(4, countDigits.countDigits(9234));  
        assertEquals(5, countDigits.countDigits(92345));  
        assertEquals(2, countDigits.countDigits(38));  
        assertEquals(1, countDigits.countDigits(7));
        
        assertEquals(4, countDigits.countDigitsWith10(9234));  
        assertEquals(5, countDigits.countDigitsWith10(92345));  
        assertEquals(2, countDigits.countDigitsWith10(38));  
        assertEquals(1, countDigits.countDigitsWith10(7));
        assertEquals(1, countDigits.countDigitsWith10(0));

	}

}
