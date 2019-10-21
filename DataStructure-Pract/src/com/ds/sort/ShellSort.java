package com.ds.sort;

public class ShellSort {

	public static void main(String[] args) {
		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Unsorted Array : ");
		displayArray(a);
		// Sorting the Array by Bubble Sort  Improved By Shell Sort
		long startTime = System.nanoTime();
		bubleSortImprovedByShellSortImpl(a);
		long endTime = System.nanoTime();
		
		System.out.println("Sorted Array by bubleSortImprovedByShellSortImpl : ");
		displayArray(a);
		System.out.println("Execution Time : " + calculateTimeElapsed(endTime, startTime));

		
		int[] b = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Unsorted Array : ");
		displayArray(b);
		startTime = System.nanoTime();
		// Sorting the Array by insertion Sort Improved By Shell Sort
		insertionSortImprovedByShellSortImpl(b);
		endTime = System.nanoTime();

		System.out.println("Sorted Array by insertionSortImprovedByShellSortImpl : ");
		displayArray(a);
		System.out.println("Execution Time : " + calculateTimeElapsed(endTime, startTime));

	}

	public static long calculateTimeElapsed(long endTime, long startTime) {
		return (endTime - startTime) ;
	}
	public static void displayArray(int a[]) {
		for (int ind = 0; ind < a.length; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}

	public static void insertionSortImprovedByShellSortImpl(int a[]) {
		// if Array is empty or with only one element no need to sort
		if (a == null || a.length == 1)
			return;

		for (int gap = calculateGap(a.length); gap > 0; gap = calculateGap(gap)) {
			System.out.println("gap is  : " + gap);
			for (int firstUnsortedIndex = gap; firstUnsortedIndex < a.length; firstUnsortedIndex++) {
				int newElement = a[firstUnsortedIndex];
				int ind = firstUnsortedIndex;
				while (ind >= gap && a[ind - gap] > newElement) {
					a[ind] = a[ind - gap];
					ind -= gap;
				}
				a[ind] = newElement;
			}
		}
	}

	public static void bubleSortImprovedByShellSortImpl(int a[]) {
		// if Array is empty or with only one element no need to sort
		if (a == null || a.length == 1)
			return;

		for (int gap = calculateGap(a.length); gap > 0; gap = calculateGap(gap)) {
			System.out.println("gap is  : " + gap);
			for (int lastUnsortedIndex = a.length - gap; lastUnsortedIndex > 0; lastUnsortedIndex--) {
				for (int ind = 0; ind < lastUnsortedIndex; ind++) {
					if (a[ind] > a[ind + gap])
						swap(a, ind, ind + gap);
				}
			}
		}
	}

	public static int calculateGap(int len) {
		// We can implement the Knuth Sequence Method to improve the Algorithm
		// performance
		// but for now returning middle of the array.
		return len / 2;
	}
	
	public static void swap(int a[], int i, int j) {
		if(i==j) return;
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
