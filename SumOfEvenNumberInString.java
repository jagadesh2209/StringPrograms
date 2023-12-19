package com.jsp.BasicStringPrograms;

public class SumOfEvenNumberInString {

	public static void main(String[] args) {
		
		String s="jaga22365984";
		String temp="";
		char[] a=s.toCharArray();
		for(char i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='1'&&ch<='9')
			{
				temp+=ch;
			}
		}
			int n=Integer.parseInt(temp);
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				if(rem%2==0)
				{
					sum+=rem;
				}
				n/=10;
			}
			System.out.println(sum);
	}
}
