package com.ds.array;

public class ArrayEx {

		public static void main(String[] args) {
			int[] intArray = new int[7]; 
			
			intArray[0] = 20;
			intArray[1] = 35;
			intArray[2] = -15;
			intArray[3] = 7;
			intArray[4] = 55;
			intArray[5] = 1;
			intArray[6] = -22;
			
			ArrayEx arrayEx = new ArrayEx();
			arrayEx.dispayArrayElements(intArray);
			System.out.println("retriveWithIndex : " + arrayEx.retriveWithIndex(intArray, 3));
			System.out.println("retriveWithoutIndex : " + arrayEx.retriveWithoutIndex(intArray, 55));
			System.out.println("addElementToFullArray : " + arrayEx.addElementToFullArray(intArray, 10));
			arrayEx.dispayArrayElements(intArray);
			System.out.println("deleteElementByShiftingElements : " + arrayEx.deleteElementByShiftingElements(intArray, 7));
			arrayEx.dispayArrayElements(intArray);
			System.out.println("addElementEndOfArrayHasSpace : " + arrayEx.addElementEndOfArrayHasSpace(intArray, 7));
			arrayEx.dispayArrayElements(intArray);
			System.out.println("insertOrUpdateElementAtIndex : " + arrayEx.insertOrUpdateElementAtIndex(intArray, 4, 33));
			arrayEx.dispayArrayElements(intArray);
			System.out.println("deleteElementBySettingNull : " + arrayEx.deleteElementBySettingNull(intArray, 5));
			arrayEx.dispayArrayElements(intArray);
			
		}
		
		/*
		 * display all elements of an Array
		 * Complexity = O(n)
		 */
		public void dispayArrayElements(int[] intArray) {
			if(intArray == null || intArray.length == 0 ) {
				System.out.println("Error ..... Please check array or Index.. returning Integer.MIN_VALUE");
			}
				
			for(int i = 0; i < intArray.length; i++) {
				System.out.print(intArray[i] + " ");
			}
			
			
		}
		
		/*
		 * Retrieve the element when we have index
		 * Complexity = O(1)
		 */
		public int retriveWithIndex(int[] intArray, int index) {
			if(intArray == null || intArray.length == 0 || index < 0 || index >= intArray.length) {
				System.out.println("Error ..... Please check array or Index.. returning Integer.MIN_VALUE");
				return Integer.MIN_VALUE;
			}
			return intArray[index];
				
		}
		
		/*
		 * Retrieve the element when we don't know index
		 * it's a linear search
		 * Complexity = O(n)
		 */
		public int retriveWithoutIndex(int[] intArray, int element) {
			
			
			if(intArray == null || intArray.length == 0) {
				System.out.println("Error ..... Please check array.. returning Integer.MIN_VALUE");
				return Integer.MIN_VALUE;
			}
			
			int index = -1;
			for(int i=0; i<intArray.length; i++) {
				if(intArray[i] == element) {
					index = i;
					break;
				}
			}
			return index == -1 ? Integer.MIN_VALUE : intArray[index];
		}
		
		/*
		 * add the element to the full array
		 * it's a copy one array to another
		 * Complexity = O(n)
		 */
		public int[] addElementToFullArray(int[] intArray, int element) {
			
			
			if(intArray == null || intArray.length == 0) {
				System.out.println("Error ..... Please check array.. returning Integer.MIN_VALUE");
				return null;
			}
			
			// create a array with plus 1 element
			int[] tempArray = new int[intArray.length + 1];
			
			// copy all element to temp array
			int i = 0;
			for(; i<intArray.length; i++) {
				tempArray[i] = intArray[i];
			}
			
			// add the element at last index
			tempArray[i] = element; 
			
			return intArray = tempArray;
		}
		
		/*
		 * Add an element to the end of an array has space
		 * Complexity = O(1)
		 */
		public int addElementEndOfArrayHasSpace(int[] intArray, int element) {
			if(intArray == null || intArray.length == 0) {
				System.out.println("Error ..... Please check array or Index.. returning Integer.MIN_VALUE");
				return Integer.MIN_VALUE;
			}
			intArray[intArray.length - 1] = element;
			return element;
				
		}
		
		
		/*
		 * Insert or update an element at a specific index
		 * Complexity = O(1)
		 */
		public int insertOrUpdateElementAtIndex(int[] intArray, int index, int element) {
			if(intArray == null || intArray.length == 0 || index < 0 || index >= intArray.length) {
				System.out.println("Error ..... Please check array or Index.. returning Integer.MIN_VALUE");
				return Integer.MIN_VALUE;
			}
			return intArray[index] = element;
				
		}
		
		
		/*
		 * Delete an element by setting it to null
		 * Complexity = O(1)
		 */
		public int deleteElementBySettingNull(int[] intArray, int index) {
			if(intArray == null || intArray.length == 0 || index < 0 || index >= intArray.length) {
				System.out.println("Error ..... Please check array or Index.. returning Integer.MIN_VALUE");
				return Integer.MIN_VALUE;
			}
			return intArray[index] = Integer.MIN_VALUE;
				
		}
		
		/*
		 * Delete an element by shifting elements
		 * Complexity = O(n)
		 */
		public int deleteElementByShiftingElements(int[] intArray, int element) {
			
			
			if(intArray == null || intArray.length == 0) {
				System.out.println("Error ..... Please check array.. returning Integer.MIN_VALUE");
				return Integer.MIN_VALUE;
			}
			
			int index = -1;
			int len = intArray.length;
			for(int i=0; i< len; i++) {
				if(intArray[i] == element) {
					index = i;
					break;
				}
			}
			// if element not found return Integer.MIN_VALUE
			if (index == -1) {
				return Integer.MIN_VALUE;
			}else {
				// else do the shifting
				for(int i = index; i < len-1; i++) {
					intArray[i] = intArray[i+1];	
				}
			}
			// And assign last element with Integer.MIN_VALUE
			intArray[len - 1] = Integer.MIN_VALUE;

			return element;
			
		}
}
