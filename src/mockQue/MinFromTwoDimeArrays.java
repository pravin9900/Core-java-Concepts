package mockQue;

public class MinFromTwoDimeArrays {

	public static void main(String[] args) {
		int a [][] = { {2,5,8},{3,9,1},{4,10,6}};
		int min = a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min= a[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
