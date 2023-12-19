package com.jsp.BasicStringPrograms;

public class RemoveExtraSpacesByUsingSplit {

	public static void main(String[] args) {

		String s="jaga    deesha    k";
		String temp="";
		String[] a=s.split(" ");
		for(String ss:a)
		{
			if(!ss.equals(""))
			{
				temp+=ss+" ";
			}
		}
		temp=temp.trim();
		System.out.println(temp);
	}

}
