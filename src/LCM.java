
public class LCM {

	//Time Complexity is O(a*b)
	public Integer getLCMNaive(int a, int b) {
		int res= a>b?a:b;
		
		while(true) {
		if(res%a==0 && res%b==0)
		   return res;
		res++;
		}
				   
	
	}

	
		public Integer getLCM(int a, int b) {
	             
			return a*b/getEuclideanGCD(a,b);
		
		}
		public int getEuclideanGCD(int a, int b) {
			
			if(b==0)
			 return a;
			
			return getEuclideanGCD(b, a%b);
			
		}

}
