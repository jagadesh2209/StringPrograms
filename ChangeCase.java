 package com.jsp.BasicStringPrograms;

public class ChangeCase 
{
	public static void main(String[] args) 
	{
		String s="KaTtaPpA";
		char ch2=' ';
		String temp="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(ch1>='A' && ch1<='Z'){
				ch2=(char)(ch1+32);
			}
			else if(ch1>='a'&& ch2<='z'){
				ch2=(char)(ch1-32);
			}
			temp +=ch2;
		}
		System.out.println(temp);
	}
}
