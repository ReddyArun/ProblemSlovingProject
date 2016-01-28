package com.problem.sloving;

class BucketSrt {
	public int[] sort(int[] array, int min, int max) {
		int range = max - min + 1;
		int[] result = new int[range>10?10:range];
		for (int i : array) {
			result[i]++;
		}
		return result;
	}
}

public class BucketSort {
	public static void main(String[] args) {
		int[] array = { 2, 1, 5, 1, 2, 3, 4, 3, 5, 6, 7, 8, 5, 6, 7, 0, 0, 9, 7, 5, 4, 3 };
		int[] sort = new BucketSrt().sort(array, 0, 14);
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort[i]; j++) {
				System.out.print(i+" ");
			}
		}
	}
}
