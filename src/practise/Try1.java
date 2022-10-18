package practise;

public class Try1 {
 
	public static void main(String[] args) {
		 int a[] = { 1,2,3,4,5,7,8,9};
		 int actSum =0;
		 for(int i=0;i<a.length;i++)
		 {
			 actSum = actSum+a[i];
		 }
		 
		 int totSum = (a.length+1) *(a.length+2)/2;
		 
		 System.out.println(totSum - actSum);
	}
}
