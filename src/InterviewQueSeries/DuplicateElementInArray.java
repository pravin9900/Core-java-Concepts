package InterviewQueSeries;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int a[] = {2,67,54,3,2,56,32,4,6,62,3,4};
		
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
