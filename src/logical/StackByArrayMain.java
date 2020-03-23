package logical;

public class StackByArrayMain {

	public static void main(String args[]) {

		StackByArray stack = new StackByArray(5);

		stack.push(5);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.peek();
		
		stack.pop();
		stack.peek();
		
		stack.deleteStack();
		stack.peek();
		stack.push(5);

	}
}
