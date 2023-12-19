package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class PrintTheUniqueCharBasedOnCharWise {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the String");
//		String s=sc.next();
		String s="BBBBDEvElopErD";       //devloperb
		char c=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(m1(s, ch)==1)
			{
				if((c+"").compareToIgnoreCase(""+ch)>0)// its is not working properly
				{
					c=ch;
				}
			}
		}
		System.out.println(c);
	}
	public static int m1(String s, char ch)
	{
		return (s.length())-(s.replace(ch+"","").length());
	}
}
