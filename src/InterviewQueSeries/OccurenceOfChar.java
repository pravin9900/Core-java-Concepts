package InterviewQueSeries;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String s = "Pravin sssappp";
		s.replace(" ", "");
		
		int a[] = new int[127];
		
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
		}
		
		int max=0;
		char c = 0 ;
		for(int i=0;i<s.length();i++)
		{
			if(max<a[s.charAt(i)])
			{
				max=a[s.charAt(i)];
				c = s.charAt(i);
			}
		}
		System.out.println(c+"   "+max);
	}
}
