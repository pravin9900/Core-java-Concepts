package singltonDesignPattern;

class Singleton{
	private static Singleton instance;
	private Singleton() {};
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
}

class Singleton2{
	private static volatile Singleton2 instance;
	private Singleton2() {};
	public static Singleton2 getInstance()
	{
		if(instance == null)
		{
			synchronized (Singleton2.class) {
				if(instance == null)
				{
					instance = new Singleton2();
				}
				
			}
		}
		return instance;
	}
}
public class SingletonClass {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton2 instance2 = Singleton2.getInstance();
		
		 
	}
}
