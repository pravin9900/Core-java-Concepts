package InterviewQue;

public class DuplicateFromTwoArray {

	public static void main(String[] args) {
		int a[] = {2,6,8,4,56,7};
		int b[] = {4,8,3,7,2,52};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
	public static void uniqValueFromArray()
	{
		int a[] = {2,6,8,4,56,7,4,8,3,7,2,52};
		
	}
}
