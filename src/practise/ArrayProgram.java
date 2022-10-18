package practise;

import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) {
		int a[] = { 2,6,5,3,8,9,2,1,4,6};
		sortAscArray(a);
		sortDescArray(a);
		duplicateEle(a);
		uniqEle(a);
	}
	
	public static void sortAscArray(int a[])
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
				
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void sortDescArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
				
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void duplicateEle(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println();
				
	}
	
	public static void uniqEle(int a[])
	{
		Arrays.sort(a);
		int i;
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				continue;
			}
			System.out.print(a[i]+" ");
		}
		System.out.println(a[i]);
	}
	
	
}
