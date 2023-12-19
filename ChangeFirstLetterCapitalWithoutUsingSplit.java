package com.jsp.BasicStringPrograms;

public class ChangeFirstLetterCapitalWithoutUsingSplit {

	public static void main(String[] args) 
	{
		String s="java is easy";
		int len=length(s);
		String[] a=new String[len+1];
		String temp="";
		int n=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				temp+=ch;
			}
			else {
				a[n++]=temp;
				temp="";
			}
		}
		a[n++]=temp;
		
		String t="";
		for(int i=0;i<a.length;i++)
		{
			t+=m1(a[i])+" ";
		}
		System.out.println(t);
	}
	public static String m1(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==0)
			{
				if(ch>='a'&&ch<='z')
				{
					temp+=(char)(ch-32);
				}
				else {
					temp+=ch;
				}
			}
			else {
				temp=temp+ch;
			}
		}
		return temp;
	}
	public static int length(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		return count;
	}

}
