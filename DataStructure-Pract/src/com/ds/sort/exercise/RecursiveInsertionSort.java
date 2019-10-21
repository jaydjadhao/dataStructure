package com.ds.sort.exercise;

public class RecursiveInsertionSort {

	public static void main(String[] args) {

		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Unsorted Array : ");
		displayArray(a);
		long startTime = System.nanoTime();
		// Sorting the Array by Bubble Sort
		insertionSortImpl(a, 1);
		long endTime = System.nanoTime();

		System.out.println("Sorted Array by insertionSortImpl : ");
		displayArray(a);
		System.out.println("Execution Time in Milliseconds : " + calculateTimeElapsed(endTime, startTime));

	}

	public static void insertionSortImpl(int[] a, int firstUnsortedIndex) {

		if (a == null || a.length == 1 || firstUnsortedIndex >= a.length )
			return;

		int newElement = a[firstUnsortedIndex];
		int ind = firstUnsortedIndex;
		for (; ind > 0 && a[ind - 1] > newElement; ind--) {
			a[ind] = a[ind - 1];
		}
		a[ind] = newElement;
		
		System.out.println("calling : insertionSortImpl(a, ++"+ firstUnsortedIndex + "); ");
		insertionSortImpl(a, ++firstUnsortedIndex);

	

	}

	public static int counter = 0;
	public static void displayArray(int a[]) {
		for (int ind = 0; ind < a.length; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}

	public static long calculateTimeElapsed(long endTime, long startTime) {
		return (endTime - startTime);
	}

}
