import java.util.ArrayList;

public class NewStack<E> extends ArrayList<E> {
	public NewStack() {
	}

	public int getSize() {
		return super.size();
	}

	public E peek() {
		return get(getSize() - 1);
	}

	public E pop() {
		E o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}

	public void push(E o) {
		add(o);
	}
}
