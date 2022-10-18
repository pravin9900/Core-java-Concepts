package mockQue;

public class AscendingOrder {

	public static void main(String[] args) {
		int a[] = { 1,4,8,5};
		int b[] = { 2,3,4,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
