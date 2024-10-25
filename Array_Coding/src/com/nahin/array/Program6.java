package com.nahin.array;

public class Program6 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int index = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (index % 2 == 0)
				sum += arr[index];
			index++;
		}
		System.out.println("sum of odd position elements : " + sum);
	}
}
