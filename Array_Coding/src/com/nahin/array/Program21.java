package com.nahin.array;

public class Program21 {

	// Method to find the missing number
	public static int findMissingNumber(int[] arr, int n) {
		// Calculate the sum of first n natural numbers
		int totalSum = n * (n + 1) / 2;

		// Calculate the sum of elements present in the array
		int arraySum = 0;
		for (int num : arr) {
			arraySum += num;
		}

		// Missing number is the difference between totalSum and arraySum
		return totalSum - arraySum;
	}

	public static void main(String[] args) {
		// Given input array
		int[] arr = { 1, 2, 3, 5 };

		// Size of the array + 1 (since one number is missing)
		int n = 5; // The length of the series

		// Find and print the missing number
		int missingNumber = findMissingNumber(arr, n);
		System.out.println("Missing number: " + missingNumber);

	}

}
