package exception;

public class ClassNotFoundExceptions {

	public static void main(String[] args) throws ClassNotFoundException  {
		Class.forName("realTimeQue.Colony");
		System.out.println("Exceuted Successfully...");
	}
}
