package com.problem.sloving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		List<String> s = new ArrayList<String>();
		for (char a = 'a'; a <= 'z'; a++) {
			s.add(a + "");
		}
		for (char a : str.toLowerCase().toCharArray()) {
			if (s.contains(a + ""))
				s.remove(a + "");
		}
		if (s.isEmpty())
			System.out.print("pangram");
		else
			System.out.print("not pangram");
	}
}
