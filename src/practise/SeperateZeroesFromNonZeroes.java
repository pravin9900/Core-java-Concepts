package practise;

public class SeperateZeroesFromNonZeroes {

	public static void main(String[] args) {
		int a[] = {2,4,0,7,-1,0,-9,0,3,0};
		int i=0;
		int j=0;
		int b[] = new int[a.length] ;
		 
		for (int k = 0; k < a.length; k++) {
			if(a[k]!= 0)
			{
				b[j]=a[k];
				j++;
			}
		}
		
		while(j<a.length)
		{
			b[j]=0;
			j++;
		}
		
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k]+" ");
		}
	}
}
