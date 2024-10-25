package com.nahin.array;

public class Program11 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num > 1) {
				boolean isPrime = true;
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(num + "");
				}
			}
		}
	}
}
