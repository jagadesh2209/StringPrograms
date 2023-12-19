package com.jsp.BasicStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccerenceOfWordsInAStringByUsingmMap {

	public static void main(String[] args) {
		        String input = "This is a test. This is only a test, but it is important.";

		        String[] a = input.split(" ");

		        Map<String, Integer> hm = new HashMap<>();

		        for (String s : a) 
		        {
		            if (s.isEmpty()) 
		            {
		                continue; 
		            }
		            
		            String s1 = s.toLowerCase(); 

		            if (hm.containsKey(s1))
		            {
		                int count = hm.get(s1);
		                hm.put(s1, count + 1);
		            } else 
		            {
		                hm.put(s1, 1);
		            }
		        }

		        for (Map.Entry<String, Integer> entry : hm.entrySet()) 
		        {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
}
