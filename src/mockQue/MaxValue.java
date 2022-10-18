package mockQue;

public class MaxValue {

	public static void main(String[] args) {
		int a[]= { 2,6,90,73,26,13};
		int max = Integer.MIN_VALUE;
		
		for(int ele : a) {
			if(ele>max)
			{
				max = ele;
			}
		}
		System.out.println(max);
	}
}
