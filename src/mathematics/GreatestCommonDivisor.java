package mathematics;

public class GreatestCommonDivisor {

	public int getGCD(int a, int b) {
		int smallerNumber=a<b?a:b;
		
		for(int i=smallerNumber;i>1;i--)
		{
			if(b%i==0 && a%i==0)
                 return i;
		}		
				return 1;		
		
		
	}
	public int getEuclideanGCD(int a, int b) {
		
		if(b==0)
		 return a;
		
		return getEuclideanGCD(b, a%b);
		
	}

}
