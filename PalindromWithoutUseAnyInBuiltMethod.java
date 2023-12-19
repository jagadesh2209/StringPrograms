package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class PalindromWithoutUseAnyInBuiltMethod {

	public static void main(String[] args) {

		String s="Madam";
		Scanner sc=new Scanner(s);
		sc.useDelimiter("");
		String temp="";
		while(sc.hasNext())
		{
			temp=sc.next()+temp;
		}
		if(s.equalsIgnoreCase(temp))
		{
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not palindrome");
		}
	} 
}
