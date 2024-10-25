package com.nahin.array;

import java.util.Arrays;

public class Program15 {
	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'c' };
		char[] arr2 = { 'b', 'd', 'c' };
		boolean isAnagram = true;
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i] || arr1.length != arr2.length) {
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram);
	}
}
