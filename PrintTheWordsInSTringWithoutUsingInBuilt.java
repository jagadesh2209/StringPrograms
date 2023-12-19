package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class PrintTheWordsInSTringWithoutUsingInBuilt {

	public static void main(String[] args) {

		String s = "java is easy";
		Scanner sc = new Scanner(s);
		sc.useDelimiter(" ");
		int count = 0;
		while (sc.hasNext()) {
			count++;
			sc.next();
		}
		System.out.println(count);
	}
}
