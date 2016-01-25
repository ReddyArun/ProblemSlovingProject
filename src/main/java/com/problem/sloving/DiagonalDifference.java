package com.problem.sloving;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		int diff = 0;
		int d1 = 0;
		int d2 = 0;

		for (int i = 0; i < n; i++) {
			d1 = d1 + a[i][i];
		}
		for (int i = 0, j = n - 1; i < n; i++, j--) {
			d2 = d2 + a[i][j];
		}
		if (d1 > d2)
			diff = d1 - d2;
		else
			diff = d2 - d1;
		System.out.print(diff);
	}
}
