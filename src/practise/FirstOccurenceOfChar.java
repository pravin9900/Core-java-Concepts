package practise;

import java.util.HashMap;
import java.util.Map;

public class FirstOccurenceOfChar {

	public static void main(String[] args) {
		String str ="JavaConceptOfTheDay";
		 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char [] value = str.toCharArray();
		for (char c : value) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for (char c : value) {
			if(map.get(c)==1)
			{
				System.out.println("First non repeated char : "+c);
				continue;
			}
			if(map.get(c)>1)
			{
				System.out.println("First repeated char : "+c);
				break;
			}
		}
		
		
		int max =0;
		char maxChar =0;
		for(Map.Entry<Character, Integer> me :map.entrySet())
		{
			if(me.getValue()>max)
			{
				max = me.getValue();
				maxChar = me.getKey();
			}
		}
		System.out.println(maxChar +" : "+max);
	}
}
