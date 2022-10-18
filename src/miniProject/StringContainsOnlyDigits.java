package miniProject;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		String str = "Batch01";
		String words = null;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				words = words + str.charAt(i);

			}
		}

		if (words.isEmpty()) {
			System.out.println("input contains only digits");
		} else {
			System.out.println("input does not contain only digits");
		}
	}
}
