package mathematics;

public class PrimeFactors {

	public StringBuffer printPrimeFactors(int num) {
		StringBuffer output = new StringBuffer();

		int number = num;

		int divisor = 2;
		while (number != 1) {
			if (number % divisor == 0 && isPrime(divisor)) {
                output.append(divisor+" ");
                number=number/divisor;
			}else {
				divisor++;
			}

		}
		System.out.println(output);

		return output;
	}

	boolean isPrime(int number) {
		if (number == 1)
			return false;
		else if (number == 2 || number == 3)
			return true;

		else if (number % 2 == 0 || number % 3 == 0)
			return false;
		else {
			for (int i = 5; i * i <= number; i = i + 6) {

				if (number % i == 0 || number % (i + 2) == 0) {
					return false;
				}
			}
			return true;
		}

	}

}
