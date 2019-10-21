package com.ds.sort.exercise;

public class StringRadixSort {

	public static void main(String[] args) {
		String[] radixStrArray = { "abdd", "jfjd", "jhsu", "lioo", "rrds", "ajkl", "atwz" };
		System.out.print("Unsorted Array : ");
		displayArray(radixStrArray);

		radixSort(radixStrArray, 4, 26);
		System.out.print("Sorted Array : ");
		displayArray(radixStrArray);
	}

	private static void radixSort(String[] radixStrArray, int width, int radix) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(radixStrArray, i, radix);
		}
	}

	private static void radixSingleSort(String[] radixStrArray, int position, int radix) {

		int[] countArray = new int[radix];
		int numItems = radixStrArray.length;

		for (String str : radixStrArray) {
			if (str != null) {
				countArray[getCharNo(str, position, radix)]++;
			}
		}

		System.out.print("Step 1 : Count Array :");
		displayArray(convertIntArrayToIntegerArray(countArray));

		// adjust the value of count Array
		for (int i = 1; i < radix; i++) {
			countArray[i] += countArray[i - 1];
		}

		System.out.print("Step 2 : Adjusted Count Array :");
		displayArray(convertIntArrayToIntegerArray(countArray));

		String[] temp = new String[numItems];

		for (int i = numItems - 1; i >= 0; i--) {
			
			System.out.println("    Step 3."+i+" : set temp[ --"+ countArray[getCharNo(radixStrArray[i], position, radix)] + "] = input["+i+"] i.e " + radixStrArray[i]);
			temp[--countArray[getCharNo(radixStrArray[i], position, radix)] ] = radixStrArray[i];
		}
		System.out.print("Step 3 : temp Array :");
		displayArray(temp);
		
		// copy array from temp to radixStrArray

		for (int i = 0; i < numItems; i++) {
			radixStrArray[i] = temp[i];
		}
		System.out.print("Step 4 : radixStrArray Array :");
		displayArray(radixStrArray);

	}

	private static int getCharNo(String str, int position, int radix) {
		char c = str.charAt(str.length() - 1 - position);
		System.out.println("called getChar char = " + c + " mapCharTodigit :" + mapCharToDigit(c + ""));
		return mapCharToDigit(c + "");
	}

	public static Integer[] convertIntArrayToIntegerArray(int[] intArray) {

		Integer[] integerArray = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			integerArray[i] = Integer.valueOf(intArray[i]);
		}
		return integerArray;

	}

	private static int mapCharToDigit(String c) {
		String capAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallAlpha = "abcdefghijklmnopqrstuvwxuz";

		return capAlpha.contains(c) ? capAlpha.indexOf(c) : smallAlpha.indexOf(c);
	}

	public static <T> void displayArray(T[] radixStrArray) {
		for (int ind = 0; ind < radixStrArray.length; ind++) {
			System.out.print(radixStrArray[ind] + " ");
		}
		System.out.println();
	}

}
