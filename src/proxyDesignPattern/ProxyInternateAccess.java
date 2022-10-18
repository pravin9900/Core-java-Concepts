package proxyDesignPattern;

public class ProxyInternateAccess implements OfficeInternetAccess {

	private String employeeName;
	private RealInternetAccess realaccess;
	
	public ProxyInternateAccess(String employeeName)
	{
		this.employeeName = employeeName;
	}

	@Override
	public void getInternateAccess() {
		 if(getRole(employeeName)>4)
		 {
			 realaccess = new RealInternetAccess(employeeName);  
             realaccess.getInternateAccess();
		 }else   
         {  
             System.out.println("No Internet access granted. Your job level is below 5");  
         }  
	}
	public int getRole(String employeeName)
	{
		return 9;
		
	}
}
