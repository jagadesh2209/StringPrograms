package com.jsp.BasicStringPrograms;

public class RemoveExtraSpacessInString {

	public static void main(String[] args) {

		String s = " Jaga     appa";
		String output = remove(s);
		System.out.println(output);
	}

	public static String remove(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				temp += ch;
			} else if (i > 0 && s.charAt(i - 1) != ' ') {
				temp += " ";
			}
		}
		return temp;
	}
}
