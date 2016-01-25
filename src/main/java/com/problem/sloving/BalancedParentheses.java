package com.problem.sloving;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author ArunkumarR
 *
 *         Sample Input
 * 
 *         3
 * 
 *         {[()]} {[(])} {{[[(())]]}}
 * 
 * 
 *         Sample Output
 * 
 *         YES NO YES
 *
 */
public class BalancedParentheses {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		Stack<Character> s;
		int n = sc.nextInt();
		while (n-- > 0) {
			String input = sc.next();
			s = new Stack<Character>();
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[')
					s.push(ch);
				else {
					if (ch == ')') {
						if (s.peek() == '(') {
							s.pop();
						} else {
							s.push(ch);
						}
					} else if (ch == '}') {
						if (s.peek() == '{') {
							s.pop();
						} else {
							s.push(ch);
						}

					} else if (ch == ']') {
						if (s.peek() == '[') {
							s.pop();
						} else {
							s.push(ch);
						}
					}
				}
			}
			System.out.println(s.isEmpty() ? "YES" : "NO");
		}
	}
}
