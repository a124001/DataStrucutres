import java.util.function.BooleanSupplier;

public class Palindrome {

	public boolean ifPalindrome(int i) {
		String bla = Integer.toString(i);
		StringBuilder stringBuilder = new StringBuilder(Integer.toString(i));
		stringBuilder.reverse();
		System.out.println(stringBuilder);

		return bla.equals(stringBuilder.toString());
	}

	public boolean ifPalindromeWithNumber(int i) {
		int originalNumber = i;
		// 123
		int reverseNumberSoFar = 0;
		while (i > 0) {
			int remainder = i % 10;
			reverseNumberSoFar = reverseNumberSoFar * 10 + remainder;
			i = i / 10;
		}
        System.out.println(reverseNumberSoFar);
		return reverseNumberSoFar == originalNumber;
	}
	

}
