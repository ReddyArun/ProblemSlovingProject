package com.problem.sloving;

import java.util.HashMap;
import java.util.Map;

public class LemphelZivProject {
	public static void main(String[] args) {
		int[] input = new int[] { 256, 'h', 'e', ',', 258, 'l', 'l', 'o', 264, 265, 266, 257, '!', 0 };
		boolean isInRange = false;
		int marker = 257;
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 256) {
				isInRange = true;
				continue;
			} else if (input[i] == 257) {
				isInRange = false;
				marker = 258;
				map = new HashMap<Integer, String>();
				continue;
			}
			if (isInRange) {
				marker++;
				if (input[i] >= 258) {
					String value1 = map.get(input[i]);
					String value2 = map.get(input[i] + 1);
					String concatinatedString = "";
					if (value2 == null) {
						concatinatedString = value1 + value1.charAt(0);
					} else {
						concatinatedString = value1 + value2;
					}
					map.put(marker, concatinatedString);
					System.out.print(concatinatedString);

				} else {
					map.put(marker, String.valueOf((char) input[i]));
					System.out.print((char) input[i]);
				}
			}
		}
	}

}
