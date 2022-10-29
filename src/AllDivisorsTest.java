import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllDivisorsTest {

	@Test
	void test() {
         AllDivisors ad =new AllDivisors();
         
         assertEquals(ad.getAllDivisors(15), "1 3 5 15 ");
	  
         assertEquals(ad.getAllDivisors(100), "1 2 4 5 10 20 25 50 100 ");
   	  
         assertEquals(ad.getAllDivisors(7), "1 7 ");
   	  
         assertEquals( "[1, 3, 5, 15]",ad.getAllDivisorsWithRootN(15));
   	  
         assertEquals("[1, 2, 4, 5, 10, 20, 25, 50, 100]",ad.getAllDivisorsWithRootN(100) );
   	  
         assertEquals(ad.getAllDivisorsWithRootN(7), "[1, 7]");

         assertEquals("1 3 5 15 ",ad.getAllDivisorsEfficientSolution(15));
   	  
         assertEquals("1 2 4 5 10 20 25 50 100 ",ad.getAllDivisorsEfficientSolution(100));
   	  
         assertEquals("1 7 ",ad.getAllDivisorsEfficientSolution(7) );
   	  
	}

}
