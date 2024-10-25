package com.nahin.array;

import java.util.HashSet;
import java.util.Set;
public class Program20 {
		    public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
		        Set<Integer> commonElements = new HashSet<>();
		        Set<Integer> set = new HashSet<>();
		        // Add elements from the first array to the set
		        for (int num : arr1) {
		            set.add(num);
		        }
		        // Check for common elements in the second array
		        for (int num : arr2) {
		            if (set.contains(num)) {
		                commonElements.add(num);
		            }
		        }
		        return commonElements;
		    }
		    public static void main(String[] args) {
		        int[] arr1 = {1, 5, 10};
		        int[] arr2 = {1, 2, 5};

		        Set<Integer> commonElements = findCommonElements(arr1, arr2);
		        System.out.println("Common elements: " + commonElements);
	}
}
