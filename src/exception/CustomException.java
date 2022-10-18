package exception;

class InvalidOrderException extends Exception {

	public InvalidOrderException(String str) {
		super(str);
	}
}

public class CustomException {

	static void order(String str) {
		try {
			if (str.equalsIgnoreCase("Coffe")) {
				System.out.println("Coffe will be ordered.");
			} else {
				throw new InvalidOrderException(str + " is not available in coffe shop.");
			}
		} catch (InvalidOrderException io) {
			System.out.println(io.getMessage());
			io.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			order("Tea");
		} finally {
			System.out.println("finally block..");
		}
	}
}
