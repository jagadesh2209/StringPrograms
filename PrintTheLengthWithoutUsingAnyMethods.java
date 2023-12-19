package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class PrintTheLengthWithoutUsingAnyMethods {

	public static void main(String[] args) {

		String s="Jaga";
		Scanner sc = new Scanner(s);
		sc=sc.useDelimiter("");
		int count=0;
		while(sc.hasNext())
		{
			count++;
			sc.next();
		}
		System.out.println(count);
	}
}
