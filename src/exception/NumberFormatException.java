package exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String value = "14226BA";
		try {
			int num = Integer.parseInt(value);
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println("NumberFormatException Occured..");
			System.out.println(e.getMessage());
		}
	}
}
