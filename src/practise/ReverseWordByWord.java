package practise;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		String[] str1 = str.split( " ");
		
		for (int i = 0; i < str1.length; i++) {
			String rev = "";
			
			for(int j=str1[i].length()-1;j>=0;j--)
			{
				rev = rev + str1[i].charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
