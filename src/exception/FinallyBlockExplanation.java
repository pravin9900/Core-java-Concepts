package exception;

public class FinallyBlockExplanation {

	public static void main(String[] args) {
		try {
			int a = 30;
			int b = a / 0;
			System.out.println(b);
		} catch (StringIndexOutOfBoundsException nfe) {
			System.out.println("String Index Out Of Bounds Exception Occured");
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("Array index out of Bound Exception occurred.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			
			System.out.println("Finally Block executed");
			System.exit(0);
		}
	}
}
