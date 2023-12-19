package com.jsp.BasicStringPrograms;

public class PrintDuplicateInAString {

	public static void main(String[] args) {

		String s="Jagadeesha";
		String temp1="";
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String temp=s.replace(c+"", "");
			int cc=s.length()-temp.length();
			if(cc>1)
			{
				temp1+=c;
			}
			s=temp;
		}
		System.out.println(temp1);
	}
 
}
