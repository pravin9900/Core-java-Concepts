package ytInterviewQue;

public class StringLowerAndUpperCase {

	public static void main(String[] args) {
		String str = "This is cloudTech This is cloudTech";
		int mid = str.length()/2;
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			 if(i<mid)
			 {
				 result = result + Character.toLowerCase(str.charAt(i));
			 }else
			 {
				 result = result + Character.toUpperCase(str.charAt(i));
			 }
		}
		System.out.println(result);
	}
}
