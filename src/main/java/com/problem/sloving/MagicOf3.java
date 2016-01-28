package com.problem.sloving;

public class MagicOf3 {
	static String getAllOneMultiple(int n) {
		int count = 1, rem = 1;
		while (rem >= 1) {
			rem = (rem * 10 + 1) % n;
			count++;
		}
		String a = "";
		while (count >= 1) {

			a = a + "1";
			count--;
		}
		return a;
	}

}
