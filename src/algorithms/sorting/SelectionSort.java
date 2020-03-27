package algorithms.sorting;

public class SelectionSort {

	public int[] sort(int arr[]) {
				
		for (int sortedIndex = 0; sortedIndex < arr.length; sortedIndex ++) {
			int minimumIndex = sortedIndex; 
			for (int i = sortedIndex + 1; i < arr.length; i ++) { // Finding the minimum in the iteration of unsorted arr
				if (arr[i] < arr[minimumIndex]) {					
					minimumIndex = i;
				}
			}
			if (minimumIndex != sortedIndex) {
				int temp = arr[sortedIndex];
				arr[sortedIndex] = arr[minimumIndex];
				arr[minimumIndex] = temp;
			}
		}

		return arr;
	}

}
