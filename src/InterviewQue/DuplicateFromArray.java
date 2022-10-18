package InterviewQue;

import java.util.ArrayList;

public class DuplicateFromArray {
	public static void main(String[] args) {
		int a[] = { 2, 6, 9, 35, 23, 2, 6, 9, 10 };

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				if (k == 1) {
					System.out.print(a[i] + " ");
				}
			}

		}
		System.out.println();
		/*
		 * Arrays.sort(a); 
		 * for(int i=0;i<a.length;i++) 
		 * { System.out.print(a[i]+" "); }
		 */
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}

	}
}
