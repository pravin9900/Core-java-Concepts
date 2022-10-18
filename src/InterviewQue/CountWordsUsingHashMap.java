package InterviewQue;

import java.util.HashMap;
import java.util.Map;

public class CountWordsUsingHashMap {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String []str1 = str.split(" ");
		Map<String,Integer> words = new HashMap<String,Integer>();
		for (String word : str1) {
			if(words.containsKey(word))
			{
				words.put(word, words.get(word)+1);
			}else
			{
				words.put(word, 1);
			}
		}
		for(Map.Entry<String, Integer> me : words.entrySet())
		{ 
			System.out.print(me.getKey()+" = "+me.getValue()+", ");
			
		}
	}
}
