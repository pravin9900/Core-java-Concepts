package realTimeQue;

import java.util.Scanner;

public class PostmanCourier {

	public static void main(String[] args) {
		callHome();
	}

	public static void callHome() {
		String street[] = { "Home1", "Home2", "Home3", "Home4", "Home5" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter home name : ");
		String home = sc.next();
		for(int i = 0; i < street.length; i++) {
			if (street[i].equalsIgnoreCase(home)) {
				int j = 0;
				do {
					System.out.println("Enter Courier receiver name : ");
					String familyMember = sc.next();

					if (familyMember.equalsIgnoreCase("head")) {
						System.out.println("If family head is present then type true else false.");
						boolean flag = sc.nextBoolean();
						if (flag) {
							System.out.println("Courier will received by family head.");
							break;
						} else {
							System.out.println("Postman will ask to family member to receive the courier.");
						}
					} else {
						switch (familyMember) {
						case "father":
							System.out.println("Father will receive courier.");
							break;
						case "mother":
							System.out.println("Mother will receive courier.");
							break;
						case "son":
							System.out.println("Son will receive courier.");
							break;
						case "daughter":
							System.out.println("Daughter will receive courier.");
							break;
						default:
							System.out.println(
									"No one is present in home. \nPostman will deliever the courier after some day.");
						}

					}
					j++;

				} while (j < 1);
			}
		}
		sc.close();
	}
}
