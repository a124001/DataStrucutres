import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AllDivisors {

	public String getAllDivisors(int num) {
		StringBuffer sb=new StringBuffer();
		
		for (int i=1; i<=num;i++) {
			
			if(num%i==0) {
				sb.append(i+" ");
			}
		}
		
		return sb.toString();
	}

	
	public String getAllDivisorsWithRootN(int num) {
		List<Integer> list=new ArrayList<Integer>();
		

		for (int i=1; i*i<=num;i++) {
			
			if(num%i==0) {
			    list.add(i);
			    list.add(num/i);
				}
		}
		list.sort(Comparator.naturalOrder());
		
        //list.forEach(System.out::println);
        
		return Arrays.toString(list.toArray());
	}
}
