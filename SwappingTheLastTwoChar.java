package com.jsp.BasicStringPrograms;

public class SwappingTheLastTwoChar {

	public static void main(String[] args) {
	   String s="JagaPJ";
	   
	   char[] a=s.toCharArray();
	   int i=s.length()-2;
	   int j=s.length()-1;
	   while(i<=j)
	   {
		  char temp=a[i];
		  a[i]=a[j];                   
		  a[j]=temp;
		  i++;
		  j--;
		}
	   for(char s1:a) {

		   	System.out.print(s1);
	   }
	   System.out.println();
	}
}
