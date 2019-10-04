package com.ds.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Unsorted Array : ");
		displayArray(a);
		// Sorting the Array by Bubble Sort
		selectionSortImpl(a);
		System.out.println("Sorted Array : ");
		displayArray(a);

	}

	public static void displayArray(int a[]) {
		for (int ind = 0; ind < a.length; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}

	public static void selectionSortImpl(int a[]) {
		// if Array is empty or with only one element no need to sort
		if (a == null || a.length == 1)
			return;

		for (int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int ind = 1; ind <= lastUnsortedIndex; ind++) {
				if (a[ind] > a[largest])
					largest = ind;
			}
			swap(a, largest, lastUnsortedIndex);
		}
	}

	public static void swap(int a[], int i, int j) {
		if (i == j)
			return;

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
