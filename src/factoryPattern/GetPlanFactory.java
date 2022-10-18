package factoryPattern;

public class GetPlanFactory {

	public Plan getPlan(String planType)
	{
		if(planType == null)
		{
			return null;
		}else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
		{
			return  new CommercialPlan1();
			
		}else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
			return  new InstitutionalPlan1();
		}
		return null ;
				 
	}
}
