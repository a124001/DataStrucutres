import java.util.ArrayList;
import java.util.List;

public class FactorialTrailingZeros {

	public int getTrailingZeros(int num) {
		int originalFactorial=1;
		int trailingZeros=0;
		for (int i = num; i > 1; i--) {

			originalFactorial=originalFactorial*i;
		}//System.out.println(originalFactorial);
		
		int factorial=originalFactorial;
		while(factorial%10==0) {
			
			factorial=factorial/10;
			trailingZeros++;
			
		}
		return trailingZeros;

	}

	public Integer getTrailingZerosEfficient(int num) {
        int numOfFive=0;

        for(int i=5;i<=num; i=i*5)
          numOfFive=numOfFive+num/i; 
        
        System.out.println(numOfFive);
		return numOfFive;
	}

}
