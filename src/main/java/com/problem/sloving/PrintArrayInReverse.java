package com.problem.sloving;

import java.util.Scanner;

/**
 * The Class PrintArrayInReverse.
 * 
 * Sample Input
 * 
 * 4
 * 
 * 1 4 3 2
 * 
 * Sample Output
 * 
 * 2 3 4 1
 */
public class PrintArrayInReverse {

	/**
	 * Rec.
	 *
	 * @param a
	 *            the a
	 * @param n
	 *            the n
	 */
	public static void rec(int a[], int n) {
		if (n > 0) {
			n = n - 1;
			System.out.print(a[n] + " ");
			if (n > 0)
				rec(a, n);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		rec(arr, n);
	}
}
