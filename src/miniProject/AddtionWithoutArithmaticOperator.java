package miniProject;

import java.util.Scanner;

public class AddtionWithoutArithmaticOperator {
	 public static void main(String [] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        String[] split = str.split(",");
	        String s1 = split[0].split("= ")[1];
	        String s2 = split[1].split("= ")[1];
	        int a = Integer.parseInt(s1);
	        
	        int b =  Integer.parseInt(s2);
	        int sum = Integer.sum(a, b);
	        System.out.println(sum);
	    }
}
