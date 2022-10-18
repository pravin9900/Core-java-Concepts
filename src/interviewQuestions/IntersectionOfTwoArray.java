package interviewQuestions;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int x[] = { 2,5,3,6,1};
		int y[] = { 2,6,7,9,20,24};
		
		for(int i=0;i<x.length;i++)
		{
			for (int j = 0; j < y.length; j++) {
				if(x[i]==y[j])
				{
					System.out.print(x[i]+", ");
				}
			}
		}
	}
}
