package algorithms.sorting;

public class BubbleSort {

	public int [] sort(int arr[]) {

		int length = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < length - 1; j++) {
				if (arr[j] > arr[j + 1]) { // comparing adjacent cells
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;

	}

}
