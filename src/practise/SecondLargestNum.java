package practise;

public class SecondLargestNum {

	public static void main(String[] args) {
		int a [] = { 2,5,8,1,58,06,72,26};
		
		int first = 0 ;
		int second = 0 ;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second = first;
				first = a[i];
			}else if(a[i]>second) {
				second = a[i];
			}
		}
		System.out.println(second);
	}
}
