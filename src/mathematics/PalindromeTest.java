package mathematics;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
		Palindrome p = new Palindrome();
        assertTrue(p.ifPalindrome(888));
        assertFalse(p.ifPalindrome(889));
	
        assertTrue(p.ifPalindromeWithNumber(888));
        assertFalse(p.ifPalindromeWithNumber(889));
        
        assertTrue(p.ifPalindromeWithNumber(0));
        assertTrue(p.ifPalindromeWithNumber(8));


	}

}
