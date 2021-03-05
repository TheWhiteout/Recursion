import java.util.ArrayList;
import java.util.Random;

public class GenericSort {
	public static void main(String[] args) {

		GeometricObject[] geometricObjectArray = { new Circle(3), new Circle(4), new Circle(5), new Rectangle(3, 5),
				new Rectangle(5, 7) };
		sort(geometricObjectArray);
		System.out.print("Sorted geometric objects: ");
		printList(geometricObjectArray);
		ArrayList<GeometricObject> list = new ArrayList<GeometricObject>();
		list.add(new Circle(3));
		list.add(new Circle(4));
		list.add(new Circle(5));
		list.add(new Rectangle(3, 5));
		list.add(new Rectangle(5, 7));
		System.out.println("Sorted geometric objects: ");
		sort(list);
		for (GeometricObject o : list) {
			System.out.println(o);
		}
		shuffle(list);
		System.out.println("Shuffled geometric objects: ");
		for (GeometricObject o : list) {
			System.out.println(o);
		}
		System.out.println("Min geometric object: " + min(list));

// Display the sorted arrays

	}

	/** Sort an array of comparable objects */
	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.length - 1; i++) {
// Find the minimum in the list[i+1..list.length−2]
			currentMin = list[i];
			currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	/** Print an array of objects */
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;
		for (int i = 0; i < list.size() - 1; i++) {
			currentMin = list.get(i);
			currentMinIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin.compareTo(list.get(j)) > 0) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}

	}

	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		sort(list);
		return list.get(0);
	}

	public static <E> void shuffle(ArrayList<E> list) {
		int size = list.size();
		int[] order = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			order[i] = random.nextInt(size);
			for (int j = 0; j < i; j++) {
				if (order[i] == order[j]) {
					i--;
					break;
				}
			}
		}
		ArrayList<E> shuffledList = new ArrayList<E>();
		for (int i = 0; i < size; i++) {
			shuffledList.add(list.get(order[i]));
		}

		/*
		 * for (int i = 0; i < size; i++) { list.set(i, shuffledList.get(i)); }
		 */

		list.clear();
		list.addAll(shuffledList);

	}

}