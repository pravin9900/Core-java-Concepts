package exception;

public class NullPointerException {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.equals("sde"));
		}catch(Exception e)
		{
			System.out.println("NullPointerException Occured..");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}
}
