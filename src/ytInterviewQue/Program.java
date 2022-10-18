package ytInterviewQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		duplicateFromArray();
		secondLargest();
		missingNumber();
		checkAnagram();
	}

	public static void duplicateFromArray() {
		int arr[] = { 3, 8, 80, 35, 3, 35, 62, 80 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
		System.out.println();

		// by collection
		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!ab.contains(arr[i])) {
				ab.add(arr[i]);
				k++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						k++;
					}
				}
				if (k > 1) {
					System.out.print(arr[i] + " ");
				}
			}

		}
		System.out.println();

	}
	// --------------------------------------------------------------------//

	public static void secondLargest() {
		int a[] = { 3, 64, 29, 59, 52, 94, 13 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > first) {
				second = first;
				first = a[i];
			} else if (a[i] > second) {
				second = a[i];
			}
		}
		System.out.println(second);
		System.out.println(first);
	}
	//-------------------------------------------------------------------\\
	public static void missingNumber()
	{
		int a[] = {1,2,3,4,5,7,8,9,10};
		int actSum = 0;
		 
		for(int i=0;i<a.length;i++)
		{
			actSum += a[i];
		}
		int sum = (10 * 11) / 2;
		System.out.println("Missing number : "+(sum-actSum));
	}
	
	public static void checkAnagram()
	{
		String str1 = "race";
		String str2 = "care";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean isAnagram = Arrays.equals(ch1, ch2);
		System.out.println("Anagram : "+isAnagram);
	}

	
}
