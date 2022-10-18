package mockQue;

public class MinFromArrays {

	public static void main(String[] args) {
		int a[] = { 2, 4, 79, 9, 6, 5 };
		int b[] = { 5, 7, 58, 12, 14 };
		int c[] = { 25, 387, 3, 6, 43, 83 };
		 
		int min1=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min1=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<min1)
			{
				min1=b[i];
			}
		}
		for(int i=1;i<c.length;i++)
		{
			if(c[i]<min1)
			{
				min1=c[i];
			}
		}
		System.out.println(min1);
		
		//second way
		
		int n1 = a.length;
		int n2 = b.length;
		int n3 = c.length;

		int arr[] = new int[n1 + n2 + n3];

		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		
		
		for (int i = 0; i < b.length; i++) {
			arr[n1 + i] = b[i];
		}
		
		
		for (int i = 0; i < c.length; i++) {
			arr[n1 + n2 + i] = c[i];
		}
		
		
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
