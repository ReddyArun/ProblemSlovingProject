package com.problem.sloving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> m = new Stack<Integer>();
		int n = Integer.parseInt(in.nextLine());
		List<Integer> i = new ArrayList<Integer>();
		while (n-- > 0) {
			// String s1 = in.nextLine();

			int l = in.nextInt();

			if (l == 1) {
				int val = in.nextInt();
				s.push(val);
				if (m.isEmpty() || val >= m.peek()) {
					m.push(val);
				}
			} else if (l == 2) {
				if (!s.isEmpty() && !m.isEmpty() && s.peek() == m.peek()) {
					m.pop();
				}
				s.pop();
			} else if (l == 3) {
				System.out.println(m.peek());
			}
		}
	}
}
