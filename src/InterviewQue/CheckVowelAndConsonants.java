package InterviewQue;

import java.util.Scanner;

public class CheckVowelAndConsonants {
 
	    public static void main(String [] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        String str1 = str.toLowerCase();
	        int vowel =0;
	        int consonants=0;
	        for(int i=0;i<str.length();i++)
	        {
	            char word = str1.charAt(i);
	            if(word =='a'||word=='e'||word=='i'||word=='o'||word=='u')
	            {
	            	vowel++;
	            }else if(word>='a'&&word<='z'){
	            	consonants++;
	            }
	        }
	        System.out.println("Vowel :: "+vowel);
	        System.out.println("Consonanats :: "+consonants);
	    }
 
}
