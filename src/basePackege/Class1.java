package basePackege;

public class Class1 {

	private int privateAge = 45;
	private void getPrivateMethod()
	{
		System.out.println("Get Method = private");
	}
	int defaultAge = 50;
	void getDefaultMethod()
	{
		System.out.println("Get Method = default");
	}
	protected int protectedAge = 55;
	protected void getProtectedMethod()
	{
		System.out.println("Get Method = protected");
	}
	public int publicAge = 55;
	public void getPublicMethod()
	{
		System.out.println("Get Method = protected");
	}
	
	
	public static void main(String[] args) {
		Class1 c = new Class1();
		c.getPrivateMethod();
		System.out.println(c.privateAge);
		c.getDefaultMethod();
		System.out.println(c.defaultAge);
		c.getProtectedMethod();
		System.out.println(c.protectedAge);
		c.getPublicMethod();
		System.out.println(c.publicAge);
		
	}
}
