package com.jsp.BasicStringPrograms;

public class MaxRepChar {

	public static void main(String[] args) {
		
		String s="ddedbbebcnccne eddd";
		char temp=' ';
		String s1=s;
		int count=0;
		while(s.length()>0)
		{
			char ch=s.charAt(0);
			String s2=s.replace(ch+"","");
			
			int cc=s.length()-s2.length();
			if(count==cc)
			{
				if(temp<ch)
				{
					temp=ch;
				}
			}
			else if(cc>count)
			{
				count=cc;
				temp=ch;
			}
			s=s2;
		}
		int t=temp;
		String c="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch==temp)
			{
				c+=t;
			}
			else {
				c+=ch;
			}
		}
		System.out.println(c);
		System.out.println("Most repeting Char in given Strig is="+temp);
	}
}
