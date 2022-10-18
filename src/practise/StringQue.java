package practise;

public class StringQue {

	public static void main(String[] args) {
		reverseString();
		reverseWordByWord();
		convertToUpperCase();
		convertToLowerCase();
	}

	public static void reverseString() {
		String str = "Pravin";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	public static void reverseWordByWord() {
		String str = "Pravin Bhagwat salunke";
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			String rev = "";
			for (int j = str1[i].length() - 1; j >= 0; j--) {
				rev = rev + str1[i].charAt(j);
			}
			System.out.print(rev + " ");
		}
		System.out.println();
	}

	public static void convertToUpperCase() {
		String str = "pravin";
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (ch > 96 && ch < 123) {
				ch = ch - 32;
				System.out.print((char) ch);
			}
		}
	}
	
	public static void convertToLowerCase() {
		String str = "PRAVIN";
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (ch > 64 && ch < 91) {
				ch = ch + 32;
				System.out.print((char) ch);
			}
		}
	}
}
