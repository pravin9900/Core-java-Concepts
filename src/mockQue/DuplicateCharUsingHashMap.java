package mockQue;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharUsingHashMap {

	public static void main(String[] args) {
		String str = "Pisdhjgsakanajsk";
		char[]ch = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character c : ch) {
			if(map.containsKey(c))
			{
				map.put(c,  map.get(c)+1);
			}else {
				map.put(c,  map.get(c));
			}
		}
		for(Map.Entry<Character,Integer> me: map.entrySet())
		{
			if(me.getValue()>1)
			{
				System.out.println(me.getKey()+"   "+me.getValue());
			}
		}
		
	}
}
