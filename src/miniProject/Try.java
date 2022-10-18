package miniProject;

import java.util.Arrays;

public class Try {

	public static void main(String[] args) {
		String str = "sjgslADFJ";
		String str1 [] = str.split("");
		Arrays.sort(str1);
		for (String string : str1) {
			System.out.print(string);
		}
	}
}
