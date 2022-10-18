package interviewQuestions;

public class fibonacciesSeries {

	public static void main(String[] args) {
		int n = 10;
		int rec;
		for (int i = 1; i <= n; i++) {
			rec = fib(i);
			System.out.print(rec + " ");
		}

	}

	public static int fib(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return (fib(n - 1) + fib(n - 2));
		}
	}
}
