package com.ds.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Unsorted Array : ");
		displayArray(a);
		long startTime = System.nanoTime();
		// Sorting the Array by Bubble Sort
		insertionSortImpl(a);
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

	public static void insertionSortImpl(int a[]) {
		// if Array is empty or with only one element no need to sort
		if (a == null || a.length == 1)
			return;

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < a.length; firstUnsortedIndex++) {
			int newElement = a[firstUnsortedIndex];
			int ind = firstUnsortedIndex;
			for (;ind > 0 && a[ind - 1] > newElement; ind--) {
				a[ind] = a[ind - 1];
			}
			a[ind] = newElement;
		}
	}
	
	public static long calculateTimeElapsed(long endTime, long startTime) {
		return (endTime - startTime) ;
	}


}
