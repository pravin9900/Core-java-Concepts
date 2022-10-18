package factoryDesignPattern;

public abstract class Plan {

	protected double rate;

	public abstract void getRate();

	public void calculateBill(int units) {
		rate = rate * units;
		System.out.println(rate);
	}

}
