package algorithms.sorting;

public class SortMain {

	public void printArray(int arr[]) {

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		SortMain sorting = new SortMain();
		int arr[] = { 0, 1, 2, 6, 4, 3, 7, 3, 11, 23 };

		System.out.println("Result from Bubble Sort");
		BubbleSort bs = new BubbleSort();
		int bubbleArr[] = bs.sort(arr);
		sorting.printArray(bubbleArr);
		
		System.out.println("Result from Selection Sort");
		SelectionSort ss = new SelectionSort();
		int selectionArr[] = ss.sort(arr);
		sorting.printArray(selectionArr);

	}

}
