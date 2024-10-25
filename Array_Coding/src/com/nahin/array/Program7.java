package com.nahin.array;

import java.util.Arrays;
import java.util.Collections;

public class Program7 {

	public static void main(String[] args) {

		// 1.with sorting method
		Integer[] arr1 = { 1, 2, 3 };
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println("Reverse Array using sort method: " + Arrays.toString(arr1));

		// 2.without sorting method
		int[] arr = { 1, 2, 3 };
		// 0,1,2
		int[] arr2 = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[index++] = arr[i];
		}
		System.out.println("Reverse Array without using sort method : " + Arrays.toString(arr2));
	}
}
