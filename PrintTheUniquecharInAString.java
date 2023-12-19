package com.jsp.BasicStringPrograms;

public class PrintTheUniquecharInAString {

	public static void main(String[] args) {

		String s="devloper";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(m1(s, ch)==1)
			{
				System.out.print(ch);
				return;
//				return;               here we have to remove this return because then its print all the unique char
			}
		}
		System.out.println("None");
		//System.out.println("None");    here we have to remove this return because then its print all the unique char
		
		}
		
		public static int m1(String s,char c)
		{
			String t=s.replace(c+"", "");
			return s.length()-t.length();
		}
} 


