package com.jsp.BasicStringPrograms;

public class PanagramProgram 
{
	public static void main(String[] args) 
	{
		String s1="The QUICK brown fox jumps over lazy dog";
		s1=s1.toLowerCase();
		
		if(panagram(s1))
		{
			System.out.println("panagram");
		}
		else {
			System.out.println("This is not panagram");
		}
	}
	static boolean panagram(String s)// inside string, other wise we a have to use the A to Z latter's
	{
//		char[] a=s.toCharArray(); //without using tocharArrayMethod
		for(char c='a';c<='z';c++)
		{
			if(!s.contains(c+""))
			{
				return false;
			}
		}
		return true;
	}
}
