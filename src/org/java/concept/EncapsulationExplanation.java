package org.java.concept;
class Encapsulation {


	public String address;
	private int bedRooms;
	private int length;
	private int bredth;
	
	public int getBedRooms() {
		return bedRooms;
	}
	public void setBedRooms(int bedRooms) {
		this.bedRooms = bedRooms;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBredth() {
		return bredth;
	}
	public void setBredth(int bredth) {
		this.bredth = bredth;
	}
	 
}

public class EncapsulationExplanation{
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.address = "Latur";
		e.setBedRooms(2);
		e.setLength( 30);
		e.setBredth(20);
		System.out.println(e.address);
		System.out.println(e.getBedRooms());
		System.out.println(e.getLength());
		System.out.println(e.getBredth());
	}
}