package com.jsp.BasicStringPrograms;

public class StringForEachLoop {

	public static void main(String[] args) 
	{
		String s="java is on opp lang";
		String [] arr=s.split("");
		for(String str:arr)
		{
			System.out.print(str);
		}
	}
}
