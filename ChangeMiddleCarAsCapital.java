package com.jsp.BasicStringPrograms;

public class ChangeMiddleCarAsCapital {

	public static void main(String[] args) {
		
		String s="Jagadeesha Swami Naveen";
//		Object a="10";
		s=s.toLowerCase();
		String[] p=s.split(" ");
		for(int i=0;i<p.length;i++)
		{
			System.out.print(m1(p[i])+" ");
		}
	}
	public static String m1(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			int len=m2(s);
		   int n=len/2;
		    char ch=s.charAt(i);
		    if(i==n)
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
		    	temp+=ch;
		    }
		}
		return temp;
	}
	
	public static int m2(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				count++;  
			}
		}
		return count;
	}
}

