package com.nahin.array;

public class Program4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 2 };
		int element = 2;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		System.out.println("Count : " + count);
	}
}
