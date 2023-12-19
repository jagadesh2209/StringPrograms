package com.jsp.BasicStringPrograms;

import demoPractice.A;

public class FindTHeLengthOfTheStringUSingSplit {

	public static void main(String[] args) {
		
		String s="java is easy";
		
		String[] a=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"="+m1(a[i]));
		}
		
	}
	public static int m1(String s)
	{
		int length=0;
//		char[] a=s.toCharArray();
//		for(int i=0;i<a.length;i++)   //without using charAt()
//		{
//			length++;
//		}
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);      //without using tocharrArray()
			if(ch!=' ')
			{
				length++;
			}
		}
		return length;
	}
}
