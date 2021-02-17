
public class Task13 {

	public static void main(String[] args) {

		int n = 6;

		System.out.println(rMethod(n));
		System.out.println(iMethod(n));

	}

	public static int rMethod(int n) {
		if (n == 0) {
			return 1;
		} else {
			return 2 * rMethod(n - 1);
		}

	}

	public static int iMethod(int n) {
		int product = 1;
		for (int i = 1; i <= n; i++) {
			product *= 2;
		}
		return product;
	}

}
