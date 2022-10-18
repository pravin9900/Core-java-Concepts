package exception;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

class VoterAge {
	public void ageCriteria(int age) {
		try {
			if (age < 18) {
				throw new InvalidAgeException("below than 18 ");
			} else {
				System.out.println("You can do voting");
			}
		} catch (InvalidAgeException a) {
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
	}
}

public class CustomeException1 {

	public static void main(String[] args) {
		VoterAge v = new VoterAge();
		try {
			v.ageCriteria(16);
		} finally {
			System.out.println("Finally block executed...");
		}
	}
}
