package com.nahin.array;

public class Program5 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int Ecount = 0, Ocount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				Ecount++;
			else
				Ocount++;
		}
		System.out.println("Even count : " + Ecount);
		System.out.println("Odd count : " + Ocount);
	}
}
