package com.jsp.BasicStringPrograms;

public class AddingNumberInStringFormat 
{

	public static void main(String[] args) 
	{
		String p="more123happy45";
		int sum=0;
		for(int i=0; i<=p.length()-1 ;i++)
		{
			char ch=p.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int num=ch-48;
				sum+=num;
			}
		}
		System.out.print(sum);
	}
}
