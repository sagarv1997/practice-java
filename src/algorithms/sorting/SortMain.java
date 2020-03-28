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
		

//		System.out.println("Result from Bubble Sort");
//		BubbleSort bs = new BubbleSort();
//		sorting.printArray(bs.sort(arr));
	
		
//		System.out.println("Result from Selection Sort");
//		SelectionSort ss = new SelectionSort();
//		sorting.printArray(ss.sort(arr));
						
//		System.out.println("Result from Insertion Sort");
//		InsertionSort is = new InsertionSort();
//		int insertionArr[] = is.sort(arr);
//		sorting.printArray(insertionArr);

//		System.out.println("Result from Bucket Sort");
//		BucketSort bs = new BucketSort();
//		int bucketArr[] = bs.sort(arr);
//		sorting.printArray(bucketArr);

		System.out.println("Result from Merge Sort");
		MergeSort ms = new MergeSort();
		int mergeArr[] = ms.sort(arr, 0 , arr.length - 1);
		sorting.printArray(mergeArr);
	}

}
