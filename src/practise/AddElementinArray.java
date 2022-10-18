package practise;

import java.util.Arrays;

public class AddElementinArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		// to add element to array
		int n = a.length;
		int newA[] = new int[n+1];
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			newA[i]=a[i];
		}
		int value = 7;
		newA[n]= value;
		System.out.println(Arrays.toString(newA));
		
		
		// to remove the element from array
		
		int rem[] = new int[n-2];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==4 || a[i]==5)
			{
				continue;
			}
			rem[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(rem));
	}
}
