package realTimeQue;

import java.util.Scanner;

public class MachineInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter raw material : ");
		String rawMaterial = sc.next();
		System.out.println("Enter end Product : ");
		String endProduct = sc.next();
		sc.close();

		switch (rawMaterial) {
		case "Cotton":
			System.out.println(endProduct + " Packed in cover.");
			break;
		case "Electronics":
			System.out.println(endProduct + " packed in box.");
			break;
		case "Wood":
			System.out.println(endProduct + " packed in plastic.");
			break;
		case "Water":
			System.out.println(endProduct + " packed in bottle.");
			break;
		default:
			System.out.println(endProduct + " Without Packeging.");
		}
	}

}
