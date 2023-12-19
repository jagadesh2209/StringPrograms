package com.jsp.BasicStringPrograms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountEachWordsInString {

	public static void main(String[] args) {
		
		String s="Java is esay";
		Scanner sc=new Scanner(s);
		sc.useDelimiter(" ");
		List<Object> l=new LinkedList<>();
		String temp="";
		while(sc.hasNext())
		{
			temp+=l.add(sc.next());
		}
		
		System.out.println(l.size());
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	}
}