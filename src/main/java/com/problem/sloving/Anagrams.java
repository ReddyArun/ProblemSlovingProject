package com.problem.sloving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	public static Map<String, List<String>> aMap = new HashMap<String, List<String>>();

	public static void main(String[] args) {
		String[] input = { "akka", "akak", "baab", "baba", "bbaa" };
		for (String s : input) {
			char[] w = s.toCharArray();
			Arrays.sort(w);
			String key = String.valueOf(w);
			if (!aMap.containsKey(key)) {
				aMap.put(key, new ArrayList<String>());
			}
			aMap.get(key).add(s);
		}
		System.out.println(aMap);
	}
}
