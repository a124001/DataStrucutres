package mathematics;

public class Factorial {

	public Integer getFactorial(int num) {
		
		int factorial=1;
		for(int i=num;i>1;i--) {
			factorial=factorial*i;
		}
		return factorial;
	}

	public Integer getFactorialWithRecursion(int i) {
		if(i==1 || i==0)
			return 1;
		return i*getFactorialWithRecursion(--i);
		
	}

}
