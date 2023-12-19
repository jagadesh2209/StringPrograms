package com.jsp.BasicStringPrograms;

public class PrintTheBiggestWordInStringUSingSplit {

	public static void main(String[] args) {
		
		String s="Java is not complete oop language";
		String[] a=s.split(" ");
		String temp="";
		for(int i=0;i<a.length;i++)
		{
			if(temp.length()==a[i].length())
			{
				if(temp.compareTo(a[i])>0) {
					temp=a[i];
				}
			}
			else if (a[i].length()>temp.length()){
				temp=a[i];
			}
		}
		System.out.println(temp);
	}
}
