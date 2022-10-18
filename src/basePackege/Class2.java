package basePackege;

public class Class2 {

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
