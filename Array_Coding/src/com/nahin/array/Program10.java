package com.nahin.array;
public class Program10 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5 };
		int[] arr1 = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr1[index++] = arr[i];
			}
		}
		arr1[index++] = arr[arr.length - 1];
		for (int i = 0; i < index; i++) {
			System.out.print(" " + arr1[i]);
		}
	}
}
