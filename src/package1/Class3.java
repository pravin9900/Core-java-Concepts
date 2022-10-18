package package1;

import basePackege.Class1;

public class Class3 extends Class1 {

public static void main(String[] args) {
	Class3 c = new Class3();
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
