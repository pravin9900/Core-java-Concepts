package practise;

public class ReplaceAllVowels {

	public static void main(String[] args) {
		String str = "India is My Country";
		
		String str1 = str.replaceAll("[AEIOUaeiou]", "");
		
		System.out.println(str1);
	}
}
