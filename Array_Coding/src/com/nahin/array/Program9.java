package com.nahin.array;

import java.util.Arrays;

public class Program9 {
	public static void main(String[] args) {

		// 1.with Sorting Method
		Integer[] arr1 = { 12, 35, 10, 34, 1 };
		Arrays.sort(arr1);
		System.out.println("Assecending order" + Arrays.toString(arr1));
		int secondlargest = arr1[arr1.length - 2];
		System.out.println("The second largest number using sorting method is: " + secondlargest+"\n");

		// 2. Without Sorting Method
		int[] arr = { 12, 35, 10, 34, 1 };
		int max;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;
				}
			}
		}
		System.out.println("Largest Element : " + Arrays.toString(arr));
		 secondlargest = arr[arr.length - 2];
		 System.out.println("The second largest without using sorting  number is: "+secondlargest);
		
	}
}
