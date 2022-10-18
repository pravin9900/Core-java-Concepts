package miniProject;

public class CheckVowel {

	public static void main(String[] args) {
		String str = "Hello World";
		String str1 = str.toLowerCase();
		for(int i=0;i<str1.length();i++)
		{
			char abc = str1.charAt(i);
			if(abc =='a'||abc == 'e'||abc =='i'|| abc =='o'||abc == 'u')
			{
				System.out.println("Vowel is present");
				break;
			}
		}
	}
}
