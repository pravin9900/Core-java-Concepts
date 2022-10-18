package InterviewQue;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int a[] = {2,7,69,23,62,48};
	//	Arrays.sort(a);
		 
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					 max=a[i];
					 a[i]=a[j];
					 a[j]=max;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println(max);
	}
}
