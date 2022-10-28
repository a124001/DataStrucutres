
public class CheckPrime {

	
	//O(n) is time complexity
	public Boolean checkPrime(int num) {
		
		if(num==1)
			return false;
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0)
					return false;
			}
			return true;
		}
		
		// TODO Auto-generated method stub
	}

	//O(sqroot(n)) is time complexity
	public Boolean checkPrimeWithSqRoot(int num) {
		
		if(num==1)
			return false;
		else if (num==2 || num==3)
			return true;
		else if (num%2==0 || num%3==0)
			return false;
		
		else {
			for(int i=5;i<=Math.sqrt(num);i=i+6) {
				if(num%i==0 || num%(i+2)==0)
					return false;
			}
			return true;
		}
		
		// TODO Auto-generated method stub
	}
}
