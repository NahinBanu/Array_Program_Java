package com.nahin.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Program26 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7 };
		int targetSum = 9;
		List<int[]> result = findPairsWithSum(arr, targetSum);

		// Print the output
		System.out.print("Pairs = ");
		for (int[] pair : result) {
			System.out.print("(" + pair[0] + ", " + pair[1] + ") ");
		}
	}

	public static List<int[]> findPairsWithSum(int[] arr, int targetSum) {
		List<int[]> pairs = new ArrayList<>();
		HashSet<Integer> seen = new HashSet<>();

		for (int number : arr) {
			int complement = targetSum - number;
			if (seen.contains(complement)) {
				pairs.add(new int[] { complement, number });
			}
			seen.add(number);
		}

		return pairs;

	}

}
