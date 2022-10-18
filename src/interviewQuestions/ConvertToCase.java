package interviewQuestions;

public class ConvertToCase {

	public static void main(String[] args) {
		String str = "Alive is awesome";
		convertCase(str);
	}
	
	public static void convertCase(String str)
	{
		int ch;
		for (int i = 0; i < str.length(); i++) {
			
			ch = str.charAt(i);
			if(ch>64&& ch<91)
			{
				ch = ch+32;
				System.out.print((char)ch);
			}else if(ch>96 && ch< 123)
			{
				ch = ch-32;
				System.out.print((char)ch);
			}
			 if(ch==32)
		            System.out.print(" ");
		        
		}
	}
}
