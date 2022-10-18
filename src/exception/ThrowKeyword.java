package exception;

public class ThrowKeyword {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(200);
		try {
			int a=10;
			throw new ArrayIndexOutOfBoundsException();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}
}
