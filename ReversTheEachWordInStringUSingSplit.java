package com.jsp.BasicStringPrograms;

public class ReversTheEachWordInStringUSingSplit {

	public static void main(String[] args) {
		
		String s="Java is not complete OOP language";
		String[] a=s.split(" ");
//		char c=' ';
		String tt="";
		for(String ss:a)
		{
			tt+=rev(ss)+" ";
		}
//		s.replace(c+"", "");
		tt=tt.trim();
		System.out.println(tt);
	}
	
	public static String rev(String s)
	{
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			temp+=ch;
		}
		return temp;
	}
//	public static String m1(String s)
//	{
//		String t="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char ch=s.charAt(i);
//			if(i==0)
//			{
//				if(ch>='a'&&ch<='z')
//				{
//					t+=(char) (ch-32);
//				}
//				else {
//					t+=ch;
//				}
//			}
//			else {
//				t+=ch;
//			}
//		}
//		return t;
//	}

}
