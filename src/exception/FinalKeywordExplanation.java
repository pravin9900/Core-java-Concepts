package exception;

//final class 
final class keyword{
	public static void m1()
	{
		System.out.println("method 1");
	}
}
class class1{
	public final void m1()
	{
		System.out.println("method 1");
	}
}
public class FinalKeywordExplanation extends class1
{
	//final method
	//public final void m1()
	{
		System.out.println("method 1 subclass");
	}

	public static void main(String[] args) {
		//final variable
		final int  a= 10;
		//a=20;
		System.out.println(a);
	}
	 
}
