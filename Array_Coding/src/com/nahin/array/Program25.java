package com.nahin.array;

import java.util.Arrays;
import java.util.HashSet;

public class Program25 {
	public static int[] findUnion(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();

		// Add elements of the first array to the set
		for (int num : arr1) {
			set.add(num);
		}

		// Add elements of the second array to the set
		for (int num : arr2) {
			set.add(num);
		}

		// Convert the set back to an array
		return set.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 4, 5 };

		int[] unionArray = findUnion(arr1, arr2);
		System.out.println("Union of the two arrays: " + Arrays.toString(unionArray));

	}

}
