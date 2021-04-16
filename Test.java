import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		PriorityQueue<String> q2 = new PriorityQueue<String>();

		String[] a1 = { "George", "Jim", "John", "Blake", "Kevin", "Michael" };
		String[] a2 = { "George", "Katie", "Kevin", "Michelle", "Ryan" };

		for (int i = 0; i < a1.length; i++) {
			q1.offer(a1[i]);
		}

		for (int i = 0; i < a2.length; i++) {
			q2.offer(a2[i]);
		}

		PriorityQueue<String> u = new PriorityQueue<String>(q1);
		u.addAll(q2);
		// System.out.println(u);

		PriorityQueue<String> i = new PriorityQueue<String>(q1);
		i.retainAll(q2);
		System.out.println(i);

		PriorityQueue<String> d = new PriorityQueue<String>(u);
		d.removeAll(i);
		System.out.println(d);

		PriorityQueue<String> r = new PriorityQueue<String>(i);
		r.addAll(d);
		System.out.println(r);
	}

}
