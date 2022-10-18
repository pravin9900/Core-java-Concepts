package InterviewQue;

public class MinFromArray {

	 public static void main(String[] args) {
		int num[]= { 2,8,34,94,14,25};
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for(int i=0;i<num.length;i++)
		{
			//first min
			if(num[i]<firstMin)
			{
				thirdMin=secondMin;
				secondMin=firstMin;
				firstMin= num[i];
			}//second min
			else if(num[i]<secondMin)
			{
				thirdMin=secondMin;
				secondMin= num[i];
			}
		}
		System.out.println(firstMin);
		System.out.println(secondMin);
		
		//max value
		int first =Integer.MIN_VALUE;
		int second =Integer.MIN_VALUE;
		int third =Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if(num[i]>first)
			{
				third=second;
				second= first;
				first = num[i];
			}
		}
		System.out.println(first);
	}
	
}
