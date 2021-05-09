import java.util.Random;

public class Task142 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] arr1 = new int[50000];
		int[] arr2 = new int[100000];

		System.out.println("Randomizing...");

		for (int i = 0; i < 50000; i++) {
			arr1[i] = r.nextInt(1000000);
		}

		System.out.println("arr1 ready");

		for (int i = 0; i < 100000; i++) {
			arr2[i] = r.nextInt(1000000);
		}
		System.out.println("arr2 ready");

		int[] arrB1 = arr1;
		int[] arrB2 = arr2;

		int[] arrS1 = arr1;
		int[] arrS2 = arr2;

		int[] arrM1 = arr1;
		int[] arrM2 = arr2;

		int[] arrQ1 = arr1;
		int[] arrQ2 = arr2;

		System.out.println("B1");
		long start = System.currentTimeMillis();
		BubbleSort.bubbleSort(arrB1);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("B2");
		start = System.currentTimeMillis();
		BubbleSort.bubbleSort(arrB2);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("S1");
		start = System.currentTimeMillis();
		SelectionSort.selectionSort(arrS1);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("S2");
		start = System.currentTimeMillis();
		SelectionSort.selectionSort(arrS2);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("M1");
		start = System.currentTimeMillis();
		MergeSort.mergeSort(arrM1);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("M2");
		start = System.currentTimeMillis();
		MergeSort.mergeSort(arrM2);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("Q1");
		start = System.currentTimeMillis();
		QuickSort.quickSort(arrQ1);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("Q2");
		start = System.currentTimeMillis();
		QuickSort.quickSort(arrQ2);
		System.out.println(System.currentTimeMillis() - start);

		System.out.println("done");
	}

}
