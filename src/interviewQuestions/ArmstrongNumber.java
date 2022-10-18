package interviewQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 370;
		int ONum = num;
		int temp =0;
		while(num>0)
		{
			int rem = num% 10;
			temp = temp + rem*rem*rem;
			num = num/10;
		}
		if(temp == ONum)
		{
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not an Armstrong number");
		}
	}
}
