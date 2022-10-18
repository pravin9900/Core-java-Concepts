package practise;

import java.util.Scanner;

public class Data {

	private String tom;
	private int biden;
	private String date;

	public String getTom() {
		return tom;
	}

	public void setTom(String tom) {
		this.tom = tom;
	}

	public int getBiden() {
		return biden;
	}

	public void setBiden(int biden) {
		this.biden = biden;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static void main(String[] args) {
		Data d = new Data();
		Scanner sc = new Scanner(System.in);
		String t1 = sc.next();
		d.setTom(t1);
		int b1 = sc.nextInt();
		d.setBiden(b1);
		String d1 = sc.next();
		d.setDate(d1);
		System.out.println(d.getTom() + " - " + d.getDate() + " - " + d.getBiden());
	}
}