
public class Task44 {

	public static void main(String[] args) {
		int[] array = { 1, 3, 3, 3, 5 };
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 10, 3, 6, 0, 15 };
		int[] array3 = { 1, 1, 1, 1, 1 };
		int[] array4 = { 1, 1, 1, 1, 2 };
		System.out.println(average(array));
		System.out.println(average(array1));
		System.out.println(average(array2));
		System.out.println(average(array3));
		System.out.println(average(array4));
	}

	public static double average(int[] array) {
		return sum(array, array.length - 1, 0) / (double) array.length;
	}

	public static int sum(int[] array, int n, int result) {
		if (n == -1) {
			return result;
		} else {
			return sum(array, n - 1, result + array[n]);
		}
	}
}
