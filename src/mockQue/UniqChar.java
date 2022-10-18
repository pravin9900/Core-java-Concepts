package mockQue;

public class UniqChar {

	public static void main(String[] args) {
		String s = "praviinsap";
		String a[] = s.split("");
		String uniq = "";
		for(int i=0;i<s.length();i++)
		{ 
			if(uniq.contains(a[i]))
			{
				continue;
			}
			uniq += a[i];
		}
		System.out.println(uniq);
	}
}
