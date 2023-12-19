package com.jsp.BasicStringPrograms;

import java.util.Scanner;

public class OccurenceOfWords {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String and After press the ENTER");
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++)//without using split method
		{
			char ch=s.charAt(i);
			if((ch==' ')&&(ch+1!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
//		String s="Jagade eesha jaga naaga seena";  //with using Split method 
//		int count=0;
//		String[] a=s.split(" ");
//		for(int i=0;i<a.length;i++)
//		{
//			count++;
//		}
//		
//		System.out.println(count);
	}
}
