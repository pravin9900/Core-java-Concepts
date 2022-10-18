package org.java.concept;

public class PersonInfo {

	String name ;
	String skinCol ;
	int age ;
	int noOfFamilyMember ;
	int asset ;
	String eduQualification ;
	
	public void printInfo()
	{
		System.out.println("Name : "+name);
		System.out.println("Skin colour : "+skinCol);
		System.out.println("Age : "+age);
		System.out.println("No Of family Member : "+noOfFamilyMember);
		System.out.println("Asset : "+asset);
		System.out.println("Educational Qualification : "+eduQualification);
	}
	
	
	
	public static void main(String[] args) {
		PersonInfo person1 = new PersonInfo();
		person1.name= "Pravin";
		person1.skinCol = "Bright";
		person1.age = 23;
		person1.noOfFamilyMember=4;
		person1.asset = 172652;
		person1.eduQualification = "BE";
		person1.printInfo();
		System.out.println("-----------------------------------");
		PersonInfo person2 = new PersonInfo();
		person2.name= "Mahesh";
		person2.skinCol= "Bright";
		person2.age=25;
		person2.noOfFamilyMember=3;
		person2.asset=3000;
		person2.eduQualification = "BA";
		person2.printInfo();
		System.out.println("\nTotal Family Member : "+(person1.noOfFamilyMember+person2.noOfFamilyMember));
	}
}
