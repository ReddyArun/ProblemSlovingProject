package com.problem.sloving;

import java.util.Scanner;

public class PrintNextFibbo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("0");
		fibbo(n - 1, 0, 1);
	}

	public static void fibbo(int len, int first, int second) {
		if (len < 0)
			return;
		System.out.print(" " + second);
		fibbo(len - 1, second, (first + second));
		
	}
}
