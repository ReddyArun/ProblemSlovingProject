package com.problem.sloving;

public class TryCatch {
	public static int ctach(int val) {
		try {
			if (val == 1)
				throw new NullPointerException();

			return 3;
		} finally {
			return 10;
			// System.out.println("c");
		}
	}

	public static void main(String[] args) {
		System.out.println(ctach(1));
		System.out.println(ctach(2));
	}
}
