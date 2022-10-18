package practise;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int a[] = {2,7,9,4};
		int b[] = {4,6,9,1};
		System.out.println("Intersection of two array : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
