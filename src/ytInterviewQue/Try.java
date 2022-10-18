package ytInterviewQue;

public class Try {

	public static void main(String args[])

	{
		int a[] = { 1, 20, 30, 67, 40, 55, 78, 90 };

		int del = 40;

		for (int i = 0; i < a.length; i++) {
			if (del == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				break;
			}
		}

		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
		}

	}
}
