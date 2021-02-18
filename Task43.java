
public class Task43 {

	public static void main(String[] args) {
		int x = 2;
		int n = 4;
		System.out.println(powRecursive(x, n));
		System.out.println(rPow(x, n));

	}

	public static int powRecursive(int x, int n) {
		if (n == 0) {
			return 1;
		}

		return x * powRecursive(x, n - 1);
	}

	public static int rPow(int x, int n) {
		return rPow(x, n, 1);
	}

	private static int rPow(int x, int n, int result) {
		if (n == 0) {
			return result;
		} else {
			return rPow(x, n - 1, result * x);
		}
	}

}
