/*////using Binary search
// * package com.nahin.array;
// * public class Program20 { public static void main(String[] args) {
// * 
// * int[] array = { 1, 3, 5, 7, 9, 11, 13, 15 }; int target = 7;
// * 
// * int index = findIndex(array, target); 
// * 
// * System.out.println("Index: " + index);
// * // Output: 3 }
// * 
// * public static int findIndex(int[] array, int target) { int left = 0; int
// * right = array.length - 1; // Implementing binary search while (left <= right)
// * { int mid = left + (right - left) / 2; if (array[mid] == target) { return
// * mid; // Target found } else if (array[mid] < target) { left = mid + 1; //
// * Search in the right half } else { right = mid - 1; // Search in the left half
// * } } return -1; // Target not found } }
 */










/////using linear search

//Algorithm:
//
//Step 1: Traverse the array
//Step 2: Match the key element with array element
//Step 3: If key element is found, return the index position of the array element
//Step 4: If key element is not found, return -1


package com.nahin.array;
public class Program27 {
	public static void main(String[] args) {
		int[] numbers = { 5, 8, 2, 1, 9, 3 };
		int target = 9;
		int index = findIndex(numbers, target);

		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found in the array.");
		}
	}
	private static int findIndex(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}