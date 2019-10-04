package com.ds.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {20,35,-15,7,55,1,-22};
		System.out.println("Unsorted Array : ");
		displayArray(a);
		// Sorting the Array by Bubble Sort
		bubleSortImpl(a);
		System.out.println("Sorted Array : ");
		displayArray(a);

	}
	
	public static void displayArray(int a[]) {
		for(int ind = 0; ind < a.length ; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}
	public static void bubleSortImpl(int a[]) {
		// if Array is empty or with only one element no need to sort 
		if(a == null || a.length == 1) return;
		
		for(int lastUnsortedIndex = a.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex --) {
			for(int ind = 0; ind < lastUnsortedIndex; ind++) {
				if(a[ind] > a[ind+1]) swap(a, ind, ind+1);
			}
		}
	}
	
	public static void swap(int a[], int i, int j) {
		if(i==j) return;
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
