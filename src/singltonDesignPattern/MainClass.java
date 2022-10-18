package singltonDesignPattern;

class LoggerClass {
	
	private static LoggerClass obj;
	
	private LoggerClass()
	{System.out.println("Logger constructor..");}		
	
	public static LoggerClass getInstance()
	{
		if(obj==null)
		{
			obj = new LoggerClass();
		}
		return obj;
	}
	
	public void logingActivity()
	{
		System.out.println("Logging method...");
	}
}

public class MainClass {
	public static void main(String[] args) {
		LoggerClass log = LoggerClass.getInstance();
		log.logingActivity();
	}
}

