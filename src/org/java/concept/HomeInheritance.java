/**
 * 
 */
package org.java.concept;

/**
 * @author Shree
 *
 */
class Father1{
	
	public void maintainanceOfHouse()
	{
		System.out.print("Plumbing , cleaning, painting");
	}
}
class Son1 extends Father1 {
	
	@Override
	public void maintainanceOfHouse()
	{
		super.maintainanceOfHouse();
		System.out.println(", Electricity, Dust cleaning"
				+ ", Gardening ");
	}
}
public class HomeInheritance {

	public static void main(String[] args) {
		Son1 s = new Son1();
		s.maintainanceOfHouse();	
	}
	
}
