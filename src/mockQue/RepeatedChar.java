package mockQue;

public class RepeatedChar {

	public static void main(String[] args) {
		String str = "pravinsa";
		
		char [] a = str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{ 
			for(int j=i+1;j<str.length();j++)
			{
				 
				if(a[i] == a[j] )
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
