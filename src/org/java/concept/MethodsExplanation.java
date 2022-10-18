package org.java.concept;

public class MethodsExplanation {

	public static void main(String[] args) {
		MethodsExplanation me = new MethodsExplanation();
	    me.convertToUpperCase("java");
	    me.convertToLowerCase("JAVA");
	    System.out.println(me.countLengthOfString("Java training"));
	    findCharAt("selenium");
	    me.findSubString( "automation", 3, 5);
	    me.containsString("Automation", "to");
	}
	
	public void convertToUpperCase(String str)
	{
		String str1 =str.toUpperCase();
		System.out.println(str1);
	}
	
	public void convertToLowerCase(String str)
	{
		String str1 =str.toLowerCase();
		System.out.println(str1);
	}
	public int countLengthOfString(String str)
	{
		int length = str.length();
		return length;
	}
	public static void findCharAt(String str)
	{
		char str1 = str.charAt(3);
		System.out.println(str1);
	}
	public void findSubString(String str,int a,int b)
	{
		String str1 = str.substring(a, b);
		System.out.println(str1);
	}
	
	public void containsString(String str, String wrd)
	{
		boolean str1 = str.contains(wrd);
		System.out.println(str1);
	}
}
