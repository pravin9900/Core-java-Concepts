package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		Integer arr[] = { 4,6,78,9,2,3};
		reverseArray(arr);
		System.out.println();
		reverseArray1(arr);
	}
	
	public static void reverseArray(Integer []arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void reverseArray1(Integer []arr)
	{
		 
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		for (Integer is : list) {
			System.out.print(is+" ");
		}
	}
	
}
