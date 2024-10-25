package com.nahin.array;

public class Program13 {
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'e', 'i' };
		int vowel = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				vowel++;
			}
		}
		System.out.println(vowel);
	}
}
