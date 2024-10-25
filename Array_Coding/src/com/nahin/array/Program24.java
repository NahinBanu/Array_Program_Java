package com.nahin.array;

public class Program24 {
	public static void sort012(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low++] = arr[mid];
				arr[mid++] = temp;
			} else if (arr[mid] == 1) {
				mid++;
			} else { // arr[mid] == 2
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high--] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] inputArray = { 0, 1, 2, 0, 1, 2 };
		sort012(inputArray);

		for (int num : inputArray) {
			System.out.print(num + " ");
		}
	}
}
