package com.nahin.array;

import java.util.Arrays;

public class Program28 {
	// Function to cyclically rotate the array by one position to the right
	public static void rotateRightByOne(int[] arr) {
		int len = arr.length;
		if (len == 0)
			return; // Handle empty array
		// Store the last element
		int lastElement = arr[len - 1];
		// Shift elements from the end to the second position
		for (int i = len - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		// Set the first element to the last element
		arr[0] = lastElement;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// Cyclically rotate the array
		rotateRightByOne(arr);
		// Print the rotated array
		System.out.println(Arrays.toString(arr)); // Output: [5, 1, 2, 3, 4]
	}
}
