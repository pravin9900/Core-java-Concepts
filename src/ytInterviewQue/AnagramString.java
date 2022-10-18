package ytInterviewQue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "care";
		String str2 = "race";
		isAnagram(str1, str2);
		isAnagram1();
	}

	public static void isAnagram(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("String is anagram.");
		} else {
			System.out.println("String is not anagram");
		}
	}

	public static void isAnagram1() {

		String str = "keep";
		String tdr = "peek";

		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		Map<Character, Integer> m2 = new HashMap<Character, Integer>();

		Character ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			Integer count = m1.get(ch);
			if (count == null) {
				m1.put(ch, 1);
			} else {
				count = count + 1;
				m1.put(ch, count);
			}
		}

		for (int i = 0; i < tdr.length(); i++) {

			ch = tdr.charAt(i);
			Integer count = m2.get(ch);
			if (count == null) {
				m2.put(ch, 1);
			} else {
				count = count + 1;
				m2.put(ch, count);
			}
		}

		boolean result = m1.equals(m2);
		if (result) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");
		}

	}
}
