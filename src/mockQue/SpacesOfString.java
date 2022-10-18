package mockQue;

public class SpacesOfString {

	public static void main(String[] args) {
		String s = "    India                   is     great      ";
		//s = s.replaceAll("  ", "");
		//System.out.println(s);
		s= s.trim();
		String a  ="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				continue ;
			}
			a = a+ s.charAt(i);
		}
		int count =0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'&& count == 0|| a.charAt(i)=='s')
			{
				System.out.print(a.charAt(i)+" ");
				count++;
				continue;
			}
			System.out.print(a.charAt(i));
		}
	}
}
