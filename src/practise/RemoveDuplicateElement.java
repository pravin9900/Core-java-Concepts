package practise;

import java.util.Arrays;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int a[]= {10,20,20,40,50,50,60};
		int n= a.length;
		int temp[] = new int[n];
		int j=0;
		for (int i = 0; i < n-1; i++) {
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		 
		for (int i = 0; i < j; i++) {	 
			 System.out.println(temp[i]);
		}
		 
		
	}
}
