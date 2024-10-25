package com.nahin.array;

import java.util.HashSet;

public class Program23 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		boolean subset = true;
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr2) {
			set.add(num);
		}
		for (int num : arr1) {
			if (!set.contains(num)) {
				subset = false;
			} else {
				subset = true;
			}
		}
		if (subset == true) {
			System.out.println("Array1 is a subset of Array2");
		} else {
			System.out.println("Array1 is not a subset of Array2");
		}
	}
}
