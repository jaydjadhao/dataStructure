package com.ds.sort.exercise;

public class DescendingMergeSort {
	public static void main(String[] args) {

		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.println("Unsorted Array : ");
		displayArray(a);
		long startTime = System.nanoTime();
		// Sorting the Array by Bubble Sort
		mergeSortImpl(a, 0, a.length);
		long endTime = System.nanoTime();

		System.out.println("Sorted Array by mergeSortImpl : ");
		displayArray(a);
		System.out.println("Execution Time in Milliseconds : " + calculateTimeElapsed(endTime, startTime));

	}

	public static void mergeSortImpl(int[] a, int low, int high) {
		
		if (high - low < 2) return;
		
		int mid = (high + low) / 2;
		
		mergeSortImpl(a, low, mid);
		mergeSortImpl(a, mid, high);
		
		merge(a,low,mid,high);
		

	}

	private static void merge(int[] a, int low, int mid, int high) {
		System.out.println("calling merge ( a,"+ low+","+ mid + ", "+ high+ ")");
		if(a[mid - 1] > a[mid]) return;
		
		int i = low; int j = 0; int k = mid;
		
		int[] b = new int[high - low];
		
		while( i < mid && k < high) {
			System.out.println(" Values i , j , k : " + i + " , " + j + " , "+ k);
			if(a[i] < a[k]) {
				b[j] = a[k];
				k++;
			}
			else {
				b[j] = a[i];
				i++;
			}
			j++;
		}
		
		if( i >= mid) {
			for(int m= k; m < high; m++) {
				b[j++] = a[m];
			}
		}else {
			for(int m= i; m < mid; m++) {
				b[j++] = a[m];
			}
		}
		
		j =0;
		for(int m= low; m < high; m++) {
			a[m] = b[j++];
		}
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
