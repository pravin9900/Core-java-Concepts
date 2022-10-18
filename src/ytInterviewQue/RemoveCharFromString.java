package ytInterviewQue;

public class RemoveCharFromString {

	public static void main(String[] args) {
		String str = "cloud Tech";
		//first
		String str1 = str.replaceAll( "c", "");
		System.out.println(str1);
		
		
		//second way
		for(int i=0;i<str.length();i++)
		{
			char a = str.charAt(i);
			if(a=='c')
			{
				continue;
			}
			System.out.print(a);
		}
	}
}
