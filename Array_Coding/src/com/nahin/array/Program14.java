package com.nahin.array;

public class Program14 {
	public static void main(String[] args) {
		int []  arr = {-1, 2, -3, 4, -5};
		int positive=0;
		int negetive=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
			}
			else if(arr[i]<0){
				negetive++;				
			}
		}
		System.out.println("Positive: "+positive +"  Negetive : "+negetive);
	}
}
