package com.jsp.BasicStringPrograms;

public class ReversAndCangeCaseOfCharector {

	public static void main(String[] args) {
		String s="Jagadeesh is bad boy";
		String[] a=s.split(" ");
		String temp="";
		for(int i=0;i<a.length;i++)
		{
			temp+=m1(a[i])+" ";
		}
		System.out.println(temp);

	}
	public static String m1(String s)
	{
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
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
				temp+=ch;
			}
		}
		return temp;
	}

}
