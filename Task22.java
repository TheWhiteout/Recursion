
public class Task22 {

	public static void main(String[] args) {
		int n = 108;
		System.out.println(dec2Bin(n));
	}

	public static String dec2Bin(int value) {
		if (value == 1) {
			return "1";
		} else {
			return dec2Bin(value / 2) + value % 2;
		}
	}
}
