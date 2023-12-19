package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		{
//			Scanner scn = new Scanner(System.in);
//			System.out.println("enter the first String ");//dynamic input by scanner class 
//			String s1=scn.next();
//			String s2=scn.next();
//			System.out.println("enter the second String ");
			
			String s1="madam";
			String s2="madam";
			
			if(anagram(s1, s2))//its checking the letters containing are not in two strings
			{
				System.out.println("anagram");
			}
			else {
				System.out.println("its not anagram");
			}
		}
	}
		static boolean anagram(String s1,String s2)
		{
			while(true)
			{
			   if(s1.length()!=s2.length()) return false;
			   if(s1.length()==0 && s2.length()==0) return true;
			   
			   char ch=s1.charAt(0);
			   s1=s1.replace(ch+"", "");
			   s2=s2.replace(ch+"","");
			}
		} 
		
	}
