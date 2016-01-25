package com.problem.sloving;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConvert {
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new SimpleDateFormat("hh:mm:ssa").parse(time)));
	}
}
