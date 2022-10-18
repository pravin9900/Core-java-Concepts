package exception;

public class ArithmaticException {

	public static void main(String[] args) {
		int a = 10;
		try {
			int b = a / 0;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("Arithmatic Exception Occurred");
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}
}
