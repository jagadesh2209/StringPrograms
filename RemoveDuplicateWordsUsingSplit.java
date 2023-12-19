package com.jsp.BasicStringPrograms;

public class RemoveDuplicateWordsUsingSplit {

	public static void main(String[] args) {

		String s = "java is java java java java jp";
		String[] a = s.split(" ");
		String temp = "";
		for (int i = 0; i < a.length; i++) {
			if (!temp.contains(a[i])) {
				temp += a[i] + " ";
			}
		}
		temp = temp.trim();
		System.out.println(temp);
	}
}
