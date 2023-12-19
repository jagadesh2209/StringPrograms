package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class FindTheStringPalindromeWithoutUsingInbuilt {

	public static void main(String[] args) {

		String s="madam";
		String s2=s;
		Scanner sc=new Scanner(s);
		sc.useDelimiter("");
		String p="";
		while(sc.hasNext())
		{
			p=sc.next()+p;
		}
		if(s2.equals(p)) 				//this is for Object Class method
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Its not Palindrome");
		}
	}
	
}
