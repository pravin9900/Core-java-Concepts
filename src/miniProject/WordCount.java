package miniProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {

	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String value = sc.nextLine();
	        String [] word = value.split(" ");
	        Arrays.sort(word);
	        Map<String, Integer> words = new TreeMap<String, Integer>();
	        for(int i=0;i<word.length;i++)
	        {
	            if(words.containsKey(word[i]))
	            {
	                words.put(word[i] , words.get(word[i])+1);
	            }else
	            {
	                words.put(word[i] , 1);
	                
	            }
	            
	        }
	        //words.forEach((k,v) -> System.out.println(k+" - "+v));
			
			  for(Map.Entry<String, Integer> me : words.entrySet()) {
			  System.out.println(me.getKey()+" - "+me.getValue()+","); }
			 
	        
	    }
}
