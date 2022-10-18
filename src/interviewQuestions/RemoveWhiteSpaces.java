package interviewQuestions;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "java is a lang";
		//first method
		str= str.replace(" ", "");
		System.out.println(str);
		
		
		//second Method
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != ' ')
			{
				System.out.print(ch);
			}
		}
		
	}
}
