package realTimeQue;

 
import java.util.Scanner;

abstract class Operation{
	public abstract void deposite(int pin);
	public abstract void withdraw(int pin);
	
}
class ATM  extends Operation {

	@Override
	public void deposite(int pin) {
		 if(pin==1234)
		 {
			 System.out.println("User deposited = 5000rs");
		 }
	}

	@Override
	public void withdraw(int pin) {
		if(pin==1234)
		 {
			 System.out.println("User withdraw = 3000rs");
		 }
	}

}

public class ATMWorking extends ATM{
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to deposite \n2 to withdraw");
		int input = sc.nextInt();
		switch(input)
		{
		case 1 :
			System.out.println("Enter pin : ");
			int pin = sc.nextInt();
			atm.deposite(pin);
			break;
		case 2 :
			System.out.println("Enter pin : ");
			int pin1 = sc.nextInt();
			atm.withdraw(pin1);
			break;
		default :
			System.out.println("Wrong option choosen");
		}
		
		sc.close();
	}
}