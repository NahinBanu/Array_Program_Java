package com.nahin.array;
import java.util.HashMap;
import java.util.Map;
public class Program17 {
	public static void main(String[] args) {
		int[] arr = { 6, 6, 1, 2, 2, 3, 3, 3, 3 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
