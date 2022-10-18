package ytInterviewQue;

import java.util.HashSet;
import java.util.Set;

public class CommonFromTwoArray {

	public static void main(String[] args) {
		int arr1[] = {80,10,15,2,35,60};
		int arr2[] = {35,80,60,20,75};
		printCommonValue(arr1, arr2);
		System.out.println();
		unionNumber(arr1, arr2);
	}
	
	public static void printCommonValue(int arr1[], int arr2[])
	{
		Set<Integer> s = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			s.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(s.contains(arr2[i]))
			{
				System.out.print(arr2[i]+" ");
			}
		}
	}
	
	public static  void unionNumber(int arr1[], int arr2[])
	{
		Set<Integer> s = new HashSet<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			 s.add(arr1[i]);	
		}
		
		for (int i = 0; i < arr2.length; i++) {
			s.add(arr2[i]);
		}
		System.out.println(s);
		
	}
}
