package mathematics;

public class CountDigits {

	public Integer countDigits(int i) {
		Integer.toString(i).length();

		return Integer.toString(i).length();

	}

	public Integer countDigitsWith10(int i) {
		int length = 0;
		 do{
			i = i / 10;
			length++;
		}while (i != 0);
		return length;
	}

}
