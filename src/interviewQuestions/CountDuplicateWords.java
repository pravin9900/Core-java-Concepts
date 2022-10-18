package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String str = "java is a Programming language java is a a";
		str= str.toLowerCase();
		String [] str2 = str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String word : str2) {
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		int count =0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			 if(entry.getValue()>1)
			 {
				 //count = count+entry.getValue();
				 System.out.println(entry.getKey()+"----"+entry.getValue());
			 }
			
		}
		 //System.out.println(count);
	}
}
