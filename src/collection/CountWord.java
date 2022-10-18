package collection;

import java.util.HashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		String values[] = "I am going to test and I am taking training on test".split(" ");
		Map<String, Integer> words = new HashMap<String, Integer>();
		for (String word : values) {
		if (words.containsKey(word)) {
		words.put(word, words.get(word) + 1);
		} else {
		words.put(word, 1);
		}
		}

		for (Map.Entry<String, Integer> me : words.entrySet()) {
		System.out.println(me.getKey() + "\t--->\t" + me.getValue());
		}
	}
}
