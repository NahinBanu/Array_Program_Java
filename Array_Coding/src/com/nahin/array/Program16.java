package com.nahin.array;

public class Program16 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };
		if (isPalindrome(arr)) {
			System.out.println("array is palindrome");
		} else {
			System.out.println("array is not palindrome");
		}
	}

	public static boolean isPalindrome(int[] arr) {
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			if (arr[i] == arr[l - i - 1]) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}