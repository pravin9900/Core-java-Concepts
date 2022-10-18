package miniProject;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	 public static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.nextLine().toLowerCase();
	        String str2 = sc.nextLine().toLowerCase();
	        
	        char [] ch1= str1.toCharArray();
	        char [] ch2 = str2.toCharArray();
	        
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);
	         
	        if(Arrays.equals(ch1, ch2))
	        {
	            System.out.println("Both inputs are anagram");
	        }else{
	            System.out.println("Both inputs are not anagram");
	        }
	    }
}
