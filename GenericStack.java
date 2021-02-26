public class GenericStack<E> {
	// private java.util.ArrayList<E> list = new java.util.ArrayList<>();
	private E[] list = (E[]) new Object[3];
	private int size = 0;

	public GenericStack() {

	}

	public int getSize() {
		return size;
	}

	public E peek() {
		return list[getSize() - 1];
	}

	public void push(E o) {
		if (size >= list.length) {
			doubleArray(o);
		} else {
			list[getSize()] = o;
		}
		size++;
	}

	public E pop() {
		E o = list[getSize() - 1];
		list[getSize() - 1] = null;
		size--;
		return o;
	}

	public boolean isEmpty() {
		return list[0] == null;
	}

	public void doubleArray(E o) {
		E[] tempList = (E[]) new Object[list.length * 2];
		System.arraycopy(list, 0, tempList, 0, list.length);
		list = tempList;
		list[getSize()] = o;
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}