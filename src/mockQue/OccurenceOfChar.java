package mockQue;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String str = "pooja";
		char [] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
	}
}
