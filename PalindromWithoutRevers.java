package com.jsp.BasicStringPrograms;

public class PalindromWithoutRevers 
{
	 public static void main(String[] args)
	{
		String s="madam";
		
		if(palindrom(s))
		{
			System.out.println("its is palndrom");
		}
		else
		{
			System.out.println("its is not palindrom");
		}
	}
	
	public static boolean palindrom(String s)
	{
		char[] a=s.toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(a[i]!=a[j])
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
 }
