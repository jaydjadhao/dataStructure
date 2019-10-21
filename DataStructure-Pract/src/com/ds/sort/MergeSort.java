package com.ds.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Unsorted Array : ");
		displayArray(a);
		long startTime = System.nanoTime();
		// Sorting the Array by Bubble Sort
		mergeSortImpl(a, 0, a.length);
		long endTime = System.nanoTime();

		System.out.println("Sorted Array by insertionSortImpl : ");
		displayArray(a);
		System.out.println("Execution Time in Milliseconds : " + calculateTimeElapsed(endTime, startTime));

	}

	public static void displayArray(int a[]) {
		for (int ind = 0; ind < a.length; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}
	
	// { 20, 35, -15, 7, 55, 1, -22 };
	public static void mergeSortImpl(int a[], int low, int high) { 
		
		System.out.println("Calling : mergeSortImpl(a," + low + ","+ high+")");
		// if Array is empty or with only one element no need to sort
		if (a == null || a.length == 1 || high- low < 2)
			return;
		
		int mid = (high + low) / 2;
		
		mergeSortImpl(a, low, mid);
		mergeSortImpl(a, mid, high);
		
		mergeImpl(a,low,mid,high);

		
	}

	public static void mergeImpl(int[] a, int low, int mid, int high) {
		System.out.println("Calling : mergeImpl(a," + low + "," + mid + ","+ high+")");

		
		if (a[mid - 1] <= a[mid]) return;
		
		int i = low; int j = low; int k = mid;
		int[] b = new int[high];
		
		while(i < mid && k < high) {
			if(a[i] < a[k]) {
				b[j] = a[i];i++;
			}
			else {
				b[j] = a[k]; k++;
			}
			j++;
		}
		if(i >= mid) {
			for(int l = k; l < high; l++) {
				b[j] = a[l]; j++;
			}
		}
		else {
			for(int l = i; l < mid; l++) {
				b[j] = a[l]; j++;
			}
		}
		displayArray(b);
		
		// Copy elements from temp aaray
		for(int l = low; l<high; l++) {
			a[l] = b[l];
		}
	}

	public static long calculateTimeElapsed(long endTime, long startTime) {
		return (endTime - startTime);
	}

}
