package com.jsp.BasicStringPrograms;

public class CountVowelsAndCountConsenents
{
	public static void main(String[] args) 
	{
		String S="jagadeesha";
		String Vowels="aeiou AEIOU";
		
		int VowelsCount=0;
		int ConsonentsCount=0;
		for(int i=0;i<=S.length()-1;i++)
		{
			char ch=S.charAt(i);
			if(Vowels.contains(ch+"")) VowelsCount++;
			
			else
			{
				ConsonentsCount++;
			}
		}
		System.out.println("VowelsCount "+VowelsCount);
		System.out.println("ConsonentsCount "+ConsonentsCount);
	}

}
