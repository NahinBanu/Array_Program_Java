package com.nahin.array;

public class Program3 {
	public static void main(String[] args) {
		int[] arr = { 34, 78, 12, 90, 56 };
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Largest Element : "+ max);
		System.out.println("smallest Element : "+min);
	}
}
