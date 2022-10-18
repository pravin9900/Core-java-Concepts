package mockQue;

public class InsertElementInArray {

	public static void main(String[] args) {
		int a[] = { 3,5,8,12,65,65,92};
		int i =4;
		int num = 50;
		
		for(int j=a.length-1;j>i;j--)
		{
			a[j]=a[j-1];
		}
		a[i]=num;
		
		for (int j : a) {
			System.out.print(j+" ");
		}
		System.out.println();
		for (int j : a) {
			if(a[j]==65)
			{
				a[j]=55;
				break;
			}
		}
		for (int j : a) {
			System.out.print(j+" ");
		}
	}
}
