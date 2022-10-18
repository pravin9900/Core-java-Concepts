package realTimeQue;

interface Television{
	
	public void printTelivisionDetails();
	public void remoteAction(int channel);
	
}
public class Remote implements Television{

	String brand;
	long prize;
	public Remote(String brand, long prize)
	{
	this.brand=brand;
	this.prize=prize;
	}
	
	@Override
	public void printTelivisionDetails() {
		 String electronicChips = "Electronic chips used for Connections";
		 System.out.println("Transmit visual images");
		 System.out.println("used to broadcast programs for entertainment, information, and education.");
		 System.out.println(electronicChips);
		
		
	}
	public void remoteAction(int channel)
	{
		if(channel==1)
		{
			System.out.println("Channel 1");
		}
		else if(channel==2)
		{
			System.out.println("Channel 2");
		}
		
	}
	
	public static void main(String[] args) {
		Remote t = new Remote("Samsung",10000);
		t.printTelivisionDetails();
	}

}
