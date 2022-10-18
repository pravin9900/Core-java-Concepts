package InterviewQue;

public class SecondLargestNumFromArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>first)
			{
				third = second;
				second = first;
				first = a[i];
				
			}else if(a[i]>second)
			{
				third = second;
				second = a[i];
			}
			
		}
		System.out.println(first);
		System.out.println(second);
		
	}
}








