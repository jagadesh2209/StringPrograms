 package com.jsp.BasicStringPrograms;

public class Parmutation 
{
	public static void main(String[] args) 
	{
		parmutation("abc",0,3);
	}
	static void parmutation(String s,int start,int end)
	{
		if(start==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=start;i<end;i++)
		{
			String s1=swap(s,start,i);
			parmutation(s1,start+1,end);
		}
	}
	
	static String swap(String s,int i,int j)
	{
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	}
}
