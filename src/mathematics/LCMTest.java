package mathematics;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCMTest {

	@Test
	void test() {
		LCM lcm = new LCM();
		assertEquals(lcm.getLCMNaive(4, 6), 12);
		assertEquals(lcm.getLCMNaive(12, 15), 60);
		assertEquals(lcm.getLCMNaive(2, 8), 8);
		assertEquals(lcm.getLCMNaive(3, 7), 21);
		
		assertEquals(lcm.getLCM(4, 6), 12);
		assertEquals(lcm.getLCM(12, 15), 60);
		assertEquals(lcm.getLCM(2, 8), 8);
		assertEquals(lcm.getLCM(3, 7), 21);


	}

}
