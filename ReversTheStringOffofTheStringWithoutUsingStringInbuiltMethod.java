package com.jsp.BasicStringPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReversTheStringOffofTheStringWithoutUsingStringInbuiltMethod {

	public static void main(String[] args) {

		String s="knowledge";
		Scanner sc=new Scanner(s);
		sc.useDelimiter("");
		String temp="";
		List l=new ArrayList();
		while(sc.hasNext())
		{
			l.add(sc.next());
		}
//		for(int i=0;i<(l.size())/2;i++)
//		{
//			temp+=l.get(i);
//		}
//		for(int i=l.size()-1;i>=l.size()/2;i--) //second off o the String
//		{
//			temp+=l.get(i);
//		}
//		System.out.println(temp);
		
		
		for(int i=(l.size())/2;i>=0;i--)
		{
			temp+=l.get(i);
		}
		for(int i=l.size()/2+1;i<l.size();i++)  //first off of the String
		{
			temp+=l.get(i);
		}
		System.out.println(temp);
	}
	
//	public static int m1(String s)
//	{
//		Scanner sc=new Scanner(s);
//		int count=0;
//		sc.useDelimiter("");
//		while(sc.hasNext())
//		{
//			count++;
//			sc.next();
//		}
//		return count;
//	}
//	public static String m2(String s)
//	{
//		Scanner sc=new Scanner(s);
//		sc.useDelimiter("");
//		String temp="";
//		while(sc.hasNext())
//		{
//			temp=sc.next()+temp;
//		}
//		return temp;
//	}

}
