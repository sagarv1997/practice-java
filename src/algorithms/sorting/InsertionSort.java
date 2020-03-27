package algorithms.sorting;

public class InsertionSort {
	
	// reference https://youtu.be/OGzPmgsI-pQ
	
	public int [] sort (int arr[]) {
		
		for (int i = 1; i < arr.length; i++) {
			
			int marker = arr[i];
			int j = i; // Starting for iteration
									
			while (j > 0 && arr[j-1] > marker) { // till the previous element is greater than the current marker
				arr[j] = arr[j-1];
				j--;
			} // going back
			
			arr[j] = marker; // setting the smaller value in the sorted array!
			
		}
		
		return arr;
	}

}
