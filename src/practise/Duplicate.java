package practise;

public class Duplicate {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 2, 5, 6, 8, 1, 3, 6};

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
			System.out.print(a[i] + " ");
		}

		System.out.println();
		int i;
		for (i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				System.out.print(a[i]+"\t");
			}
		}
	 	}
}
