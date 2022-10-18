package factoryPattern;

public class GenerateBill {
	
	public static void main(String[] args) {
		GetPlanFactory planFactoty = new GetPlanFactory();
		 
		Plan p = planFactoty.getPlan("CommercialPlan"); 
		p.getPlan();
		p.calculateBill(100);
	}

}
