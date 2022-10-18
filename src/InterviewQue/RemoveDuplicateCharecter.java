package InterviewQue;

public class RemoveDuplicateCharecter {

	public static void main(String[] args) {
		String str = "aabhkkddg";
		
		int count[] = new int[255];
		for(int i=0;i<str.length();i++)
		{
			count[(str).charAt(i)]++;
		}
		for(int j=0;j<255;j++)
		{
			if(count[j]==1)
			System.out.print((char)j);
		}
	}
}
