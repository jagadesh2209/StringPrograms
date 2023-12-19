package com.jsp.BasicStringPrograms;

public class CapitalLetterInEachWord 
{
	public static void main(String[] args)
	{
		String s1="java is easy";
		String s2="";
		String[] a=s1.split(" ");
		for(String s:a)//for each loop
		{
			s2+=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
			s2+=" ";
		}
		s2=s2.trim();
		System.out.println(s2);
	}
}