 package com.jsp.BasicStringPrograms;

public class ReversString
{
	public static void main(String[] args) 
	    {
		   String s="java is easy";
//		   System.out.println(revers(s1));
		   
		   char[] a=s.toCharArray();
		   int i=0,j=a.length-1;
		  
		   while(i<j)
		   {
			   char temp=a[i]; // this is for without using method 
			   a[i]=a[j];
			   a[j]=temp;
			   i++;
			   j--;
		   }
		 for(char s1:a)
		 {
			 System.out.print(s1);
		 }
		 System.out.println();
		   
		}
//	 public static String revers(String s)
//	   {
//		  char[] a=s.toCharArray();
//		  int i=0,j=a.length-1;
//		  while(i<j)
//			{
//				char temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//				i++;
//				j--;
//			}
//			return new String(a);
//	   }
		
}
