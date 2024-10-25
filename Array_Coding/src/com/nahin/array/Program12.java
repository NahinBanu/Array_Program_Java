package com.nahin.array;

public class Program12 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		boolean issorted = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				issorted = false;
				break;
			}
		}
		System.out.println(issorted);
	}
}
