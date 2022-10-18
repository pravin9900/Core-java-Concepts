package practise;

import java.util.Arrays;

public class StringIsAnagram {

	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
		isAnagram(s1,s2);
	}
	
	public static void isAnagram(String s1, String s2)
	{
		
		boolean status = true;
		if(s1.length()!= s2.length())
		{
			  status = false;
		}else {
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			status = Arrays.equals(c1, c2);
		}
		
		if(status)
		{
			System.out.println(s1+" and "+ s2 + " are anagram String.");
		}else{
			System.out.println(s1+" and "+ s2 + " are not anagram String.");
			
		}
		 
	}
}
