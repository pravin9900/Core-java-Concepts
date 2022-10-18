package org.java.concept;

public class Home {

	int length=10;
	int bredth =20;
	static String address= "Pune";
	static String homeName = "ABC";
	
	public static void bedRoomArea(int length, int bredth)
	{
		int bedRoomArea = length*bredth;
		//Local variable
		System.out.println(bedRoomArea);
		
	}

	public void diningRoomArea(int length, int bredth)
	{
		int diningRoomArea = length*bredth;
		System.out.println(diningRoomArea);
		//static variable
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		//non-static variable
		Home home = new Home();
		System.out.println(home.length);
		//static variable
		System.out.println(address);
		System.out.println(homeName);
		
		
		Home.bedRoomArea(30, 10);
	}
}
