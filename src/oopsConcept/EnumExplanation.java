package oopsConcept;

enum Month {
	JAN, FEB, MARCH, APRIL, MAY, JUN, JULY, AUG, SEP, OCT, NOV, DEC;

	Month() {
		System.out.println(this.toString());
	}

	public void printMonth() {
		System.out.println("Enum method");
	}
}

public class EnumExplanation {

	public static void main(String[] args) {
		Month m1 = Month.OCT;
		System.out.println(m1);
		m1.printMonth();
	}
}
