package mockQue;

public class MaxFromArray {

	public static void main(String[] args) {
		int a[] = {1,5,8,9,2,4,3,10};
		int temp = 0 ;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
		System.out.println();
		System.out.println(a[a.length-1]);
		
	}
}
