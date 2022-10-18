package exception;

public class StringOutOfBoundIndex {

	public static void main(String[] args) {
		String str = "Automation";
		try {
			System.out.println(str.charAt(10));
		}
		catch(Exception e)
		{
			System.out.println("StringIndexOutOfBoundException Occured..");
			System.out.println(e.getMessage());
		}
		
	}
}
