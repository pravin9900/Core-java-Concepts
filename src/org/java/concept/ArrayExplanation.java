package org.java.concept;

public class ArrayExplanation {

	public static void main(String[] args) {
		int a[] = {2,3,4,5,6,7,8,9,10,11};
		
		for(int i=0;i<a.length;i++)
		{
			int value=0;
			value = a[i]/2;
			value= value +1;
			if(value%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
