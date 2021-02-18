
public class Task41 {

	public static void main(String[] args) {
		System.out.println(foo(100, 25));
		System.out.println(foo(49, 25));
		System.out.println(foo(5, 25));

	}

	// gcd method
	public static int foo(int x, int y) {
		if (y == 0)
			return x;
		else
			return foo(y, x % y);
	}

}
