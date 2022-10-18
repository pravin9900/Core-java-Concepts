package practise;

public class IsRotationOfString {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "AVAJ";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("s1 and s2 is not rotation of string.");
		}else {
			String s3 = s1 + s1;
			if(s3.contains(s2))
			{
				System.out.println("s1 and s2 is a rotation of string.");
			}else {
				System.out.println("s1 and s2 is not rotation of string.");
			}
		}
	}
}
