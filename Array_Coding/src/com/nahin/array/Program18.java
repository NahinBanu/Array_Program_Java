package com.nahin.array;

public class Program18 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		int[] merged = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			merged[arr1.length + i] = arr2[i];
		}
		System.out.print("Merged Array: {");
		for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] + (i < merged.length - 1 ? ", " : ""));
		}
		System.out.println("}");
	}
}
