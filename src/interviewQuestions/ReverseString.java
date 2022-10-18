package interviewQuestions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Java";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		
		reverseString();
	}
	public static void reverseString( )
	{ 
		String str = "Automation using selenium";
		char[] abc = str.toCharArray();
		List<Character> list = new LinkedList<>();
		
		for (Character cha : abc) {
			list.add(cha);
		}
		Collections.reverse(list);
		ListIterator it = list.listIterator();
		 while (it.hasNext()) {
			 System.out.print(it.next());
		}
		
	}
}
