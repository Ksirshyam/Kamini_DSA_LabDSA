import java.util.Scanner;
import java.util.Stack;

public class bracketbalancing {

	// Function to check if brackets are balanced or not.
	boolean ispar(String s) {
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				st.push(x);
			}
			if (st.isEmpty()) {
				return false;
			}
			char popItewm;
			switch (x) {
			case '}':
				popItewm = st.pop();
				if (popItewm == '[' || popItewm == '(') {
					return false;
				}
				break;
			case ']':
				popItewm = st.pop();
				if (popItewm == '{' || popItewm == '(')
					return false;
				break;
			case ')':
				popItewm = st.pop();
				if (popItewm == '{' || popItewm == '[')
					return false;
				break;
			}

		}
		return (st.isEmpty());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type string: ");
		String bracket = input.next();
		bracketbalancing obj = new bracketbalancing();
		boolean status = obj.ispar(bracket);
		if (status == true) {
			System.out.println("the brackets are balanced!");
		} else {
			System.out.println("the brackets are not balanced!");

		}
		input.close();
	}

}

