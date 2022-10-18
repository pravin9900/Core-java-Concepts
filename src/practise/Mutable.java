package practise;

public class Mutable {

	public static void main(String[] args) {
		String str ="JAVA";
		String str1 = "JAVA";
		System.out.println(str==str1);//true
		str=str.concat("LAng");
		System.out.println(str  == str1);//false
		
		String s1 = new String("Pravin");
		String s2 = new String("Salunke");
		System.out.println(s1.equals(s2));//false
		String s3 = new String("Salunke");
		System.out.println(s3.equals(s2));//true
		s3.concat("Patil");
		System.out.println(s3.equals(s2));//true
		System.out.println(s3);
	}
}
