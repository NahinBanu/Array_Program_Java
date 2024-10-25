package com.nahin.array;

import java.util.HashSet;

public class Program19 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1};
		HashSet<Integer> set = new HashSet<>();
		System.out.println("Duplicate Numbers:" );
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				int num =arr[i];
				System.out.println(num);
			}
		}
	}
}
