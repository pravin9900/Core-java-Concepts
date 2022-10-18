package exception;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 7, 1 };
		try {
			System.out.println(a[5]);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException Occurred");
			System.out.println(e.getMessage());
		}

	}
}
