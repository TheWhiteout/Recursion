
public class Task14 {

	public static void main(String[] args) {

		double x = 4.2;
		int n = 3;

		System.out.println(rMethod(x, n));
		System.out.println(iMethod(x, n));

	}

	public static double rMethod(double x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * rMethod(x, n - 1);
		}

	}

	public static double iMethod(double x, int n) {
		double product = 1;
		for (int i = 1; i <= n; i++) {
			product *= x;
		}
		return product;

	}

}
