package com.jsp.BasicStringPrograms;

public class RemoveDuplicate{
	public static void main(String[] args){
		String s="abaabcde";
		String temp="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(!temp.contains(ch+"")){
				temp+=ch;
			}
		}
		System.out.println(temp);
	}
}
