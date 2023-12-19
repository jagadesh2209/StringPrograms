package com.jsp.BasicStringPrograms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindTheLengthOfEachWordWithoutLength {

	public static void main(String[] args) {
		String s = "Java is Esay";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " " + length(a[i]));
		}
	}

	public static int length(String s) {
		int n = 0;
		Scanner sc = new Scanner(s);
		sc.useDelimiter("");
		while (sc.hasNext()) {
			n++;
			sc.next();
		}
		return n;
	}
}

//String s = "java is easy";
//
//List<Object> l = new LinkedList<>();
//String[] a = s.split(" ");
//for (int i = 0; i < a.length; i++) {
//	l.add(a[i] + " " + length(a[i]));
//}
//
//for (int i = 0; i < l.size(); i++) {
//	System.out.println(l.get(i));
//}
//
//}
//
//public static int length(String s) {
//Scanner sc = new Scanner(s);
//sc.useDelimiter("");
//int count = 0;
//while (sc.hasNext()) {
//	count++;
//	sc.next();
//}
//return count;
//}
