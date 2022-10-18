package practise;

import java.util.Arrays;

public class Try {

	public static void main(String[] args) {
		int a[] = { 2, 4, 56, 9, 387, 262, 23, 1, 3, 2, 9, 9 };
		removeDuplicates(a);
	}

	static void removeDuplicates(int[] a) {
		int uniq = a.length;
		for (int i = 0; i < uniq; i++) {
			for (int j = i + 1; j < uniq; j++) {
				if (a[i] == a[j]) {
					a[j] = a[uniq - 1];
					uniq--;
					j--;
				}
			}
		}
		int[] arrayWithoutDuplicates = Arrays.copyOf(a, uniq);
	 
		System.out.println("Array Without Duplicates : ");

		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			System.out.print(arrayWithoutDuplicates[i] + "\t");
		}

	}
}
