package algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

	public int[] sort(int arr[]) {

		// Finding the number of buckets.
		int length = arr.length;
		int numberOfBuckets = (int) Math.ceil(Math.sqrt(length));

		// Finding the minimum and maximum value in the arr, required for inserting the
		// values in appropriate buckets
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for (int i : arr) {
			if (minValue > i) {
				minValue = i;
			} else if (maxValue < i) {
				maxValue = i;
			}
		}

		// Create an array of buckets
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
		
		// Initializing array inside array
		for (int i = 0; i < buckets.length; i ++) {
			buckets[i] = new ArrayList<Integer>();	
		}
		
		for (int value: arr) {
			int bucketNumber = (int) Math.ceil((value * numberOfBuckets) / maxValue); // Formula to find appropriate value
			buckets[bucketNumber - 1].add(value);
		}
		
		// Sorting Buckets using sorting method from Collections
		for (ArrayList<Integer> bucket: buckets) {
			Collections.sort(bucket);
		}
		
		// Concatenate Array
		int index=0;
		for(ArrayList<Integer> bucket: buckets) {
			for(int value: bucket) {
				arr[index] = value;
				index++;
			}
		}

		return arr;
	}

}
