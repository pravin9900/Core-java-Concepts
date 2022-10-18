package mockQue;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[] = { 1,24,5,3,6,7,3,4,7,1,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
