package com.jsp.BasicStringPrograms;

public class ReversTheInItCampMethodWithotUsingSplitMethod {

	public static void main(String[] args) {

		String s="java is not complte OOp language ";
		String temp="";
		int len=m1(s);
		String[] a=new String[len];
		int p=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				temp+=ch;
			}
			else {
				a[p++]=temp;
				temp="";
			}
		}
		String tt="";
		for(int i=0;i<a.length;i++)
		{
			String t=a[i];
			tt+=rev(t)+" ";
		}
		System.out.println(tt);
	}
	
	public static String rev(String s)
	{
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			if(i==0)
			{
				if(ch>='a'&&ch<='z')
				{
					t+=(char) (ch-32);
				}
				else 
				{
					t+=ch;
				}
			}
			else {
				t+=ch;
			}
		}
		return t;
	}
	
	public static int m1(String s)
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
