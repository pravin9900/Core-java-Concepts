package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNoOfWord {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String word = null;
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "I am going to test and I am taking training on test");
		int count = 0;
		
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			String[] str = m.getValue().split(" ");
			 word= sc.next();
			for (int i = 0; i <= str.length - 1; i++) {
				
				if (str[i].contains(word)) {
					count++;
				}
			 
			}
		}
		System.out.println(word +"--"+count);
	}
}
