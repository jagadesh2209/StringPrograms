package com.jsp.BasicStringPrograms;

public class CharctorCount {

	public static void main(String[] args) 
	{
		String s="abbcccdddca";
		System.out.println(m1(s));
	}
	public static String m1(String s) 
	{
		char[] a=s.toCharArray();
	    String s2="";
	    int i=0,count;
	    char c;
	    while(i<a.length)
	    {
	    	c=a[i];
	    	count=1;
	    	while(i<a.length-1&&a[i+1]==c)
	    	{
	    		count++;
	    		i++;
	    	}
	    	s2=s2+count+c;
	    	i++;
	    }
	    return s2;
	}
}
