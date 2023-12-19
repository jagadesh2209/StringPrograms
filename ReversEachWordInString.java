 package com.jsp.BasicStringPrograms;

public class ReversEachWordInString
{
	public static void main(String[] args) 
	{
		String s="java is on oop lang";
		char[] a=s.toCharArray();
		String s1="";
		int i=0,j=0;
		while(i<a.length)
		{
			while(j<a.length && a[j]!=' ')j++;
			int k=j-1;
			String t=""; 
			while (k>=i)
			{
				t+=a[k];
				k--;
			}
			s1+=t;
			if(j<a.length) s1+=" ";
			j++;
			i=j;
		}
		System.out.println(s1);
	}
}
