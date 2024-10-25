package com.nahin.array;

import java.util.Arrays;

public class Program29 {
	// Function to left rotate the array by n positions
	public static void rotateLeft(int[] arr, int n) {
		int len = arr.length;
		n = n % len; // To handle cases where n is greater than the length of the array

		// Reverse the first part (0 to n-1)
		reverseArray(arr, 0, n - 1);

		// Reverse the second part (n to len-1)
		reverseArray(arr, n, len - 1);

		// Reverse the entire array
		reverseArray(arr, 0, len - 1);
	}

	// Helper function to reverse a portion of the array
	private static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 2;

		// Left rotate the array
		rotateLeft(arr, n);

		// Print the rotated array
		System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 1, 2]

	}

}
