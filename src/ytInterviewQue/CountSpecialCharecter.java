package ytInterviewQue;

public class CountSpecialCharecter {

	public static void main(String[] args) {
		String str = "CloudTech#$%";
		int count = 0;
		String abc = "";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (! Character.isDigit(a)&& ! Character.isLetter(a)&& ! Character.isWhitespace(a)) {
				count++;
			}else
			{
				abc= abc+a;
			}
		}
		
		System.out.println("No of special charecter :" + count);
		System.out.println(abc);
	}
}