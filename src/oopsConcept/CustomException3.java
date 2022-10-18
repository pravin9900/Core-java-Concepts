package oopsConcept;

class InvalidOTPException extends Exception {

	public InvalidOTPException(String str) {
		super(str);
	}
}

public class CustomException3 {

	public static void main(String[] args) {
		String s = "2134";
		try {
			if (s.equalsIgnoreCase("1234")) {
				System.out.println("Continue transaction....");
			} else {
				throw new InvalidOTPException("You entered wrong OTP.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
