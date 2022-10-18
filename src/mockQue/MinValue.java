package mockQue;

public class MinValue {

	public static void main(String[] args) {
		int a[]= { 2,6,90,73,26,13};
		int min = Integer.MAX_VALUE;
		
		for(int ele : a)
		{
			if(ele<min)
			{
				min = ele;
			}
		}
		System.out.println(min);
		
	}
}
