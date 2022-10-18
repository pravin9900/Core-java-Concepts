package miniProject;

import java.util.Scanner;

public class MaximumOccuranceOfChar {
	 
		public static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        maxOccuringChar(str);
	    }
	    
	    static void maxOccuringChar(String str)
	    {
	        int max =0;
	        
	        int count[] = new int[256];
	        
	        for(int i=0;i<str.length();i++)
	        {
	            count[str.charAt(i)]++;
	            if(count[str.charAt(i)]>max)
	            {
	                max= count[str.charAt(i)];
	            }
	        }
	        System.out.print("maximum occurence of charecters is ");
	        for(int i=0;i<256;i++)
	        {
	            if(count[i]==max)
	            System.out.print((char)i+", ");
	        }
	        
	    }
}
