package mockQue;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		String s = "pravinsa";
		char[] a = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : a) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey() + "   =   " + m.getValue());
			}
		}
	}
}
