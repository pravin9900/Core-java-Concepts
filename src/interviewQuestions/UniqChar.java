package interviewQuestions;

import java.util.HashSet;

public class UniqChar {

	public static void main(String[] args) {
		String str = "Alive swum";
		boolean result = false;
		
		HashSet<Character> uniqChar = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			result = uniqChar.add(a);
			if(result == false)
			{
				break;
			}
		}
		System.out.println("Uniq char String : "+result);
	}
}
