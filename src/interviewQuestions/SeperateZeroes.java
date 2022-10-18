package interviewQuestions;

public class SeperateZeroes {

	public static void main(String[] args) {
		int a[] = { 12, 0, 7, 0, 8, 0, 3 };
		allZeroAtLast(a);
		System.out.println();
		printAllZeroAtStart(a);
	}

	public static void allZeroAtLast(int a[]) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[count] = a[i];
				count++;
			}
		}
		while (count < a.length) {
			a[count] = 0;
			count++;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}

	public static void printAllZeroAtStart(int[] a) {
		int count = a.length - 1;

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				a[count] = a[i];
				count--;
			}
		}

		while (count >= 0) {
			a[count] = 0;
			count--;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}
}
