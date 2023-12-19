package com.jsp.BasicStringPrograms;

public class PrintTheBiggestAndSmallestWord {

	public static void main(String[] args) {

		String s="Jgadeesha naveena seena ndkJB AjkdnJD N";
		String[] a=s.split(" ");
		String small="";
		String big="";
		for(int i=0;i<a.length;i++)
		{
			small=a[i];
			if(a[i].length()<small.length())
			{
				small=a[i];
			}
			if(big.length()<a[i].length())
			{
				big=a[i];
			}
		}
	System.out.println(small);
	System.out.println(big);
	}

}
