import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AllDivisors {

	public String getAllDivisors(int num) {
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				sb.append(i + " ");
			}
		}

		return sb.toString();
	}

	public String getAllDivisorsWithRootN(int num) {
	
		Set<Integer> set=new TreeSet<Integer>();

		for (int i = 1; i * i <= num; i++) {

			if (num % i == 0) {
				set.add(i);
				set.add(num / i);
			}
		}
		// list.forEach(System.out::println);

		return Arrays.toString(set.toArray());
	}

	public String getAllDivisorsEfficientSolution(int num) {

		StringBuffer sb = new StringBuffer();

		int i = 1;
		for (i = 1; i * i < num; i++) {

			if (num % i == 0) {
				sb.append(i + " ");

			}
		}

		for ( ; i * i >= 1; i--) {

			if (num % i == 0) {
				sb.append(num/i + " ");

			}
		}

		
		return sb.toString();
	}
}
