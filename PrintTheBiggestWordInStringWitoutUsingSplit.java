package com.jsp.BasicStringPrograms;

public class PrintTheBiggestWordInStringWitoutUsingSplit {

	public static void main(String[] args) {
		
		String s="java is not oop language complete ";
		int len=space(s);
		String[] a=new String[len];
		String k="";
		int p=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				k+=ch+"";
			}
			else {
				a[p]=k;
				k="";
				p++;
			}
		}
		String temp="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()==temp.length())
			{
				if(temp.compareTo(a[i])>0)
				{
					temp=a[i];
				}
			}
			else if(a[i].length()>temp.length()){
				temp=a[i]; 
			}
		}
		System.out.println(temp);
	}
	
	public static int space(String s)
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
