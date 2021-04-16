import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		String code = "[])";
		int length = code.length();
		Stack<Character> brackets = new Stack<Character>();
		for (int i = 0; i < length; i++) {
			if (code.charAt(i) == '(' || code.charAt(i) == '{' || code.charAt(i) == '[') {
				brackets.push(code.charAt(i));
			} else if (code.charAt(i) == ')') {
				if (brackets.isEmpty() || brackets.pop() != '(') {
					System.out.println("No.");
					return;
				}
			} else if (code.charAt(i) == '}') {
				if (brackets.isEmpty() || brackets.pop() != '{') {
					System.out.println("No.");
					return;
				}
			} else if (code.charAt(i) == ']') {
				if (brackets.isEmpty() || brackets.pop() != '[') {
					System.out.println("No.");
					return;
				}
			}
		}
		if (!brackets.isEmpty()) {
			System.out.println("No.");
		} else {
			System.out.println("Yes.");
		}
	}

}
