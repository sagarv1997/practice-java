package ds.logical;

public class StackByArray {

	int arr[];
	int topOfStack;

	public StackByArray(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("Stack of size " + size + " created");
	}

	public boolean isStackFull() {
		if (topOfStack == arr.length - 1) {
			return true;
		} else
			return false;
	}

	public boolean isStackEmpty() {
		if (topOfStack == -1) {
			return true;
		} else
			return false;
	}

	public boolean isStackExist() {

		if (null == arr) {
			return true;
		} else
			return false;
	}

	public void push(int value) {
		if (isStackExist()) {
			System.out.println("Stack does not exist");
		} else if (isStackFull()) {
			System.out.println("Stack is full");
		} else {
			arr[topOfStack + 1] = value;
			topOfStack++;
		}
	}

	public void pop() {
		if (isStackExist()) {
			System.out.println("Stack does not exist");
		} else if (isStackFull()) {
			System.out.println("Stack is full");
		} else {
			arr[topOfStack] = Integer.MIN_VALUE;
			topOfStack--;
		}

	}

	public void peek() {
		if (isStackExist()) {
			System.out.println("Stack does not exist");
		}
		else if (isStackEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			System.out.println(arr[topOfStack]);
		}
	}

	public void deleteStack() {
		arr = null;
		topOfStack = -1;
		System.out.println("Stack successfully deleted");
	}

}
