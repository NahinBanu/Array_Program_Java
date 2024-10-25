package com.nahin.array;

public class Program30 {
	public static void rightRotate(int[] arr, int n) {
		int length = arr.length;
		n = n % length; // Handle cases where n is greater than the length

		// Reverse the entire array
		reverse(arr, 0, length - 1);
		// Reverse the first n elements
		reverse(arr, 0, n - 1);
		// Reverse the remaining elements
		reverse(arr, n, length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5 };
		int n = 2;

		rightRotate(inputArray, n);

		// Print the rotated array
		System.out.print("Output: [");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
			if (i < inputArray.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}

}
