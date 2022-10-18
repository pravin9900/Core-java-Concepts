package ytInterviewQue;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		int actualSum = 0;
		for (int i = 0; i < a.length; i++) {
			actualSum = actualSum + a[i];
		}
		int sum = (10 * 11) / 2;
		System.out.println("Missing number is " + (sum - actualSum));
	}
}
