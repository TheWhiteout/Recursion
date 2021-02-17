
public class Task21 {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(even(n));
		System.out.println(odd(n));
	}

	public static boolean even(int x) {
		if (x == 0) {
			return true;
		} else if (x == 1) {
			return false;
		} else {
			return even(x - 2);
		}
	}

	public static boolean odd(int x) {
		if (x == 1) {
			return true;
		} else if (x == 0) {
			return false;
		} else {
			return odd(x - 2);
		}
	}

}
