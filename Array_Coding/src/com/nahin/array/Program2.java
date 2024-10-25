package com.nahin.array;

public class Program2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		float avg = 0;
		int sum = 0, length = arr.length;
		for (int i = 0; i < length; i++) {
			sum += arr[i];
			avg = sum / length;
		}
		System.out.println("Average : " + avg);
	}
}
