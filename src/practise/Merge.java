package practise;

public class Merge {

	public static void main(String[] args) {
		int a[] = { 2,4,5,8,1};
		int b[] = { 5,7,92,34,6};
		int c[] = { 2,4,68,9,4};
		int d[] = new int[a.length+b.length+c.length]; 
		for (int i = 0; i < a.length; i++) {
			d[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			d[a.length+i]=b[i];
		}
		for (int i = 0; i < c.length; i++) {
			d[a.length+b.length+i]=c[i];
		}
		for (int i = 0; i < d.length; i++) {
			 System.out.print(d[i]+" ");
		}
	}
}
