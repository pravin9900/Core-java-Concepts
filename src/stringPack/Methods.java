package stringPack;

public class Methods {

	public static void main(String [] args)
	{
		String str = "adshdsudjsnsaa";
		
		str = str.replaceFirst("a", "z");
		System.out.println(str);
		str = str.replaceAll("dsh", "");
		System.out.println(str);
	  
	}
}
