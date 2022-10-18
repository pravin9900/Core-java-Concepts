package org.java.concept;

public class StringMethods {

	public static void main(String[] args) {
		String str = "SDET Traing Batch2";
		String str1 = "sdet Traing Batch2";
		String value = "I am in Class";
		String value1 = "  i am in class  ";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(7));
		System.out.println(value1.trim());
		System.out.println(str.concat(value));
		System.out.println(str.replace('a', '*'));
		System.out.println(value.replace("I am", "You are"));
		System.out.println(value.contains("am"));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equals(str1));
		System.out.println(str.substring(8));
		System.out.println(str.substring(5, 8));
	}
}
