package InterviewQueSeries;

public class MaximumConsecutivesOnes {

	public static void main(String[] args) {
		int a[] = { 1,1,0,1,0,1,1,1,1,0,1,0,1};
		
		int n = a.length;
		int count =0;
		int result =0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				count =0;
				
			}else if(a[i]==1)
			{   
				count++;
				result = Math.max(result, count);
			}
		}
		
		System.out.println(result);
	}
}
