package algorithms.sorting;

public class MergeSort {

	public int[] sort(int[] arr, int left, int right) {
		if (left < right) {
			int middle = ((right + left) / 2);
			sort(arr, left, middle);
			sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}

		return arr;
	}

	public void merge(int[] A, int left, int middle, int right) {
		// Adding 1 extra space in both for maximum value
		int[] leftTmpArray = new int[middle - left + 2]; // Create tmp arrays
		int[] rightTmpArray = new int[right - middle + 1];

		for (int i = 0; i <= middle - left; i++) // Copy values from Array 'A' to these tmp arrays
			leftTmpArray[i] = A[left + i];
		for (int i = 0; i < right - middle; i++)
			rightTmpArray[i] = A[middle + 1 + i];

		leftTmpArray[middle - left + 1] = Integer.MAX_VALUE; // Merge values and insert into Array 'A'
		rightTmpArray[right - middle] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		
		// Because both left and right arrays are already sorted
		for (int k = left; k <= right; k++) {
			if (leftTmpArray[i] < rightTmpArray[j]) {
				A[k] = leftTmpArray[i];
				i++;
			} else {
				A[k] = rightTmpArray[j];
				j++;
			}
		}

	}

}
