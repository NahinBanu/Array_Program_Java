package com.nahin.array;

import java.util.Arrays;
import java.util.Collections;

public class Program8 {

	public static void main(String[] args) {

		// 1.with sorting method
		Integer[] arr1 = { 8, 2, 4, 10, 9 };
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println("Desecending order" + Arrays.toString(arr1));

		int secondsmallest = arr1[arr1.length - 2];
		System.out.println("The second largest using sorting  number is:  " + secondsmallest + "\n");

		// 2. Without Sorting Method
		int[] arr = { 8, 2, 4, 10, 9 };
		int max;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;
				}
			}
		}
		System.out.println("Largest Element : " + Arrays.toString(arr));
		secondsmallest = arr[arr.length - 2];
		System.out.println("The second largest without using sorting  number is: " + secondsmallest);
	}
}
