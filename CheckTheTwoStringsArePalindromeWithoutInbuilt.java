package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class CheckTheTwoStringsArePalindromeWithoutInbuilt {

	public static void main(String[] args) {

		String s="nayan";
		String s1=m2(s);
		if(isPalindrome(s, s1)&&s.equals(s1))
		{
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not palindrom");
		}
	}
	
	
public static int m1(String s)
{
	int count=0;
	Scanner sc = new Scanner(s);
	sc.useDelimiter("");
	while(sc.hasNext())
	{
		count++;
		sc.next();
	}
	return count;
}

public static String m2(String s)
{
	String temp="";
	Scanner sc=new Scanner(s);
	sc.useDelimiter("");
	while(sc.hasNext())
	{
		temp=sc.next()+temp;
	}
	return temp;
}

public static boolean isPalindrome(String s1,String s2)
{
	if(m1(s1)!=m1(s2))
	{
		return false;
	}
	return true;
}

}
