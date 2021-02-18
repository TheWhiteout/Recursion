
public class Task42 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Sum is " + xMethod(n));
		System.out.println("Sum is " + sumRecursive(n));
	}

	public static int xMethod(int n) {
		if (n == 1)
			return 1;
		else
			return n + xMethod(n - 1);
	}

	public static int sumRecursive(int n) {
		return sumRecursive(n, 0);
	}

	private static int sumRecursive(int n, int result) {
		if (n == 0) {
			return result;
		} else {
			return sumRecursive(n - 1, result + n);
		}
	}
}
