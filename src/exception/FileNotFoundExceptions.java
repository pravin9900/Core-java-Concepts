package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptions{

	public static void main(String[] args) throws FileNotFoundException  {
		File file = new File("D:\\data.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String data = scan.nextLine();
			System.out.println(data);
		}
		
		System.out.println(file.canRead());
		scan.close();
		System.out.println("Success..");
	}
}
