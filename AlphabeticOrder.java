package com.jsp.BasicStringPrograms;

public class AlphabeticOrder {

	public static void main(String[] args) 
	{
		String s="apple";
		System.out.println(rev(s));
	}
	public static String rev(String s)
	{
		char[] a=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=s.length()-1;j>i;j--)
			{
				if(a[i]<a[j]) {
					char ch=a[i];
				}
				else if(a[i]>a[j])			//this 'if' cnd line is write other wise leave it.
				{
					char  temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return new String(a);
	}
}
