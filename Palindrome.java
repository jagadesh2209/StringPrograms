package com.jsp.BasicStringPrograms;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String s="Nayan";
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			temp +=ch;
		}
		if(s.equalsIgnoreCase(temp))//equals() 
		{
			System.out.println( temp+ " it is a palindrome" );
		}
		else
		{
			System.out.println(temp+ "it is   not a palindrome");
		}
	}
}
