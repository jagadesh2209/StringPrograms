package com.jsp.BasicStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesByUsingMap {
	
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
	                hm.put(s1, hm.get(s1) + 1);
	            } 
	            else 
	            {
	                hm.put(s1, 1);
	            }
	        }

	        StringBuilder uniqueWords = new StringBuilder();
	        for (String word : a) 
	        {
	            String lowerCaseWord = word.toLowerCase();
	            if (hm.get(lowerCaseWord) == 1) 
	            {
	                if (uniqueWords.length() > 0) 
	                {
	                    uniqueWords.append(" ");
	                }
	                uniqueWords.append(word);
	            }
	        }

	        String result = uniqueWords.toString();
	        System.out.println("Original String: " + input);
	        System.out.println("String with Duplicate Words Removed: " + result);
	}
}
