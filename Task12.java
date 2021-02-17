
public class Task12 {

	public static void main(String[] args) {
		int n = 1234567;
		xMethod(n);
		System.out.println("\n");
		iMethod(n);
	}

	public static void xMethod(int n) {
		if (n > 0) {
			System.out.print(n % 10);
			xMethod(n / 10);
		}
	}

	public static void iMethod(int n) {
		System.out.println(new StringBuilder(Integer.toString(n)).reverse().toString());
	}

}
