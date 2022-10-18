package practise;

public class FibonacciProgram {

	public static void main(String[] args) {
		int n = 10;
		// fibo(n);
		int rec;
		for (int i = 1; i <= n; i++) {
			rec = fib(i);
			System.out.println(rec);
		}
	}

	public static void fibo(int n) {
		int num1 = 0, num2 = 1;
		int count = 0;
		while (count < n) {
			System.out.println(num1);
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			count++;

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
