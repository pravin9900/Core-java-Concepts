package proxyDesignPattern;

public class RealInternetAccess implements OfficeInternetAccess {

	private String employeeName;
	
	public RealInternetAccess(String employeeName)
	{
		this.employeeName = employeeName;
	}

	@Override
	public void getInternateAccess() {
		 System.out.println("Internate access granted for employee : "+employeeName);
	}
 
}
