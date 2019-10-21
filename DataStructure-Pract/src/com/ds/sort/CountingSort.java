package com.ds.sort;

public class CountingSort {
	public static void main(String[] args) {
		int[] a = {2,5,9,8,2,8,7,10,4,3};
		System.out.println("Unsorted Array : ");
		displayArray(a);
		long startTime = System.nanoTime();
		// Sorting the Array by Bubble Sort
		countingSortImpl(a, 1, 10);
		long endTime = System.nanoTime();

		System.out.println("Sorted Array by countingSortImpl : ");
		displayArray(a);
		System.out.println("Execution Time in nanoseconds : " + calculateTimeElapsed(endTime, startTime));


	}
	
	public static void displayArray(int a[]) {
		for(int ind = 0; ind < a.length ; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}
	public static void countingSortImpl(int a[], int min, int max) {
		// if Array is empty or with only one element no need to sort 
		if(a == null || a.length == 1) return;
		
		int[] countArray = new int[(max - min)+ 1];
		for(int i = 0; i< a.length; i++) {
			countArray[a[i] - min]++;
		}
		
		int j = 0;
		
		// copy element from countArray	
		for(int i = min; i <= max; i++) {
			while(countArray[i - min] > 0 ) {
				a[j++] = i;
				countArray[i - min] --;
			}
		}
	}

	
	public static double calculateTimeElapsed(long endTime, long startTime) {
		return (endTime - startTime) ;
	}

}
