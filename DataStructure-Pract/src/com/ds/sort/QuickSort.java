package com.ds.sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		System.out.print("Unsorted Array  a: ");
		displayArray(a);
		long startTime = System.nanoTime();
		// Sorting the Array by Bubble Sort
		quickSortImpl(a, 0, a.length);
		long endTime = System.nanoTime();

		System.out.print("Sorted Array by quickSortImpl : ");
		displayArray(a);
		System.out.println("Execution Time in Milliseconds : " + calculateTimeElapsed(endTime, startTime));

	}

	public static void displayArray(int a[]) {
		for (int ind = 0; ind < a.length; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}
	
	public static int methodCounter = 0;

	// { 20, 35, -15, 7, 55, 1, -22 };
	public static void quickSortImpl(int a[], int low, int high) { 
		int k = ++methodCounter;
		System.out.println("\n"+ k +". Start Calling : quickSortImpl(a," + low + ","+ high+")");
		// if Array is empty or with only one element no need to sort
		if (high- low < 2) {
		    System.out.println(k+". End Calling : quickSortImpl(a," + low + ","+ high+")");
			return;
		}
		int pivotIndex = partition(a,low,high);
		System.out.println(" pivotindex returned is " + pivotIndex);
		quickSortImpl(a,low,pivotIndex);
		quickSortImpl(a,pivotIndex+1,high);

	    System.out.println(k+". End Calling : quickSortImpl(a," + low + ","+ high+")");

		
	}

	public static int partition(int[] a, int low, int high) {
		System.out.println("  Start Calling : partition(a," + low + ","+ high+")");
		int pivot = a[low];
		int i = low; int j = high;
		
		System.out.println("    pivot = "+pivot);
		System.out.print("    Array a : ");
		displayArray(a);
		while (i < j) {
			// Empty backward Loop to search correct location
			while( i < j && a[--j] >= pivot);
			System.out.println("    step 1: After backward Loop i = " + i + " and  j = " + j);
			if(i < j) {
				System.out.println("     Substituting a[" +i+"]" + " = a["+j+"] so a["+i+"] = " + a[j] );
				a[i] = a[j];
				System.out.print("     Array a : ");
				displayArray(a);
			}
			
			// Empty forward Loop to search correct location
			while( i < j && a[++i] <= pivot);
			System.out.println("    Step 2: After forward Loop i = " + i + " and  j = " + j);
			if(i < j) {
				System.out.println("     Substituting a[" +j+"]" + " = a["+i+"] so a["+j+"] = " + a[i] );
				a[j] = a[i];
				System.out.print("     Array a : ");
				displayArray(a);
			}
			
		}
		
		System.out.println("    Step 3 : Substituting pivot element a[" +j+"]" + " = pivot"+" so a["+j+"] = " + pivot );
		a[j] = pivot;
		System.out.print("    Array a : ");
		displayArray(a);

		System.out.println("   After Loop completion i = " + i + " and  j = " + j);
		System.out.println("  Call End : partition(a," + low + ","+ high+")");
		return j;
	}



	public static long calculateTimeElapsed(long endTime, long startTime) {
		return (endTime - startTime);
	}

}
