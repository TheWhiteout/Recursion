
public class Task11 {

	public static void main(String[] args) {

		int n = 5;
		System.out.println("Sum is " + xMethod(n));
		System.out.println("Sum is " + iMethod(n));

	}

	public static int xMethod(int n) {
		if (n == 1)
			return 1;
		else
			return n + xMethod(n - 1);
	}

	public static int iMethod(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
