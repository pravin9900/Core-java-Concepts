package proxyDesignPattern;

import java.util.Scanner;

public class ProxyPatternClient {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternateAccess("Pravin kale");
		access.getInternateAccess();
		 
	}
}
