package factoryPattern;

public abstract class Plan {

	protected double rate ;
	abstract void getPlan();
	
	public void calculateBill(int unit)
	{
		System.out.println("Bill amount : "+ (unit*rate));
	}
	
}
