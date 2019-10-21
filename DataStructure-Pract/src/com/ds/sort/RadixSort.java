package com.ds.sort;

public class RadixSort {

	public static void main(String[] args) {
		int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
		System.out.print("Unsorted Array : ");
		displayArray(radixArray);
		
		radixSort(radixArray, 10, 4);
		

		System.out.print("\nSorted Array by RadixSort : ");
		displayArray(radixArray);
	}

	private static void radixSort(int[] input, int radix, int width) {
		for(int i = 0; i < width; i++) {
			System.out.println("\ncalling radixSingleSort(input, " +i+ ", " + radix + ")");
			radixSingleSort(input, i, radix);
			System.out.println("End call radixSingleSort(input, " +i+ ", " + radix + ")");

		}
	}

	private static void radixSingleSort(int[] input, int position, int radix) {
		int numItems = input.length;
		int[] countArray = new int[radix];
		
		for(int value:input) {
			countArray[getDigit(value,position, radix)]++;
		}
		
		System.out.print("  Step 1 : Count Array : ");
		displayArray(countArray);
		//Adjust the Count Array
		for(int j = 1; j < radix; j++) {
			countArray[j] += countArray[j-1];
		}
		System.out.print("  Step 2 : Adjusted Count Array : ");
		displayArray(countArray);
		
		int[] temp = new int[numItems];
		for(int tempIndex = numItems-1; tempIndex >= 0 ; tempIndex--) {
			System.out.println("    Step 3."+tempIndex+" : set temp[ --"+ countArray[getDigit(input[tempIndex], position, radix)] + "] = input["+tempIndex+"] i.e " + input[tempIndex]);
			temp[--countArray[getDigit(input[tempIndex], position, radix)]] = input[tempIndex];
		}
		
		System.out.print("  Step 3 : temp Array : ");
		displayArray(temp);
		
		for(int tempIndex=0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
		
		System.out.print("  Step 4 : input Array : ");
		displayArray(input);
	}

	private static int getDigit(int value, int position, int radix) {
		int digit = value /(int) Math.pow(10, position) % radix;
		System.out.println("     getDigit returned : " + digit);
		
		return digit;
	}
	
	public static void displayArray(int a[]) {
		for(int ind = 0; ind < a.length ; ind++) {
			System.out.print(a[ind] + " ");
		}
		System.out.println();
	}

}
