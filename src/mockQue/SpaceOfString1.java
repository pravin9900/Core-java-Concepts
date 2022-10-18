package mockQue;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SpaceOfString1 {

	public static void main(String[] args) {
		String s = "      IndiA     IS     GREAT       country ";
		String[] s1 = s.split(" ");
		List<String> l = new ArrayList<String>();
		for (String st : s1) {
			if (!(st.trim().isEmpty()))
				l.add(st);
		}
		
		ListIterator<String> it = l.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
}
