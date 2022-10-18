package org.java.concept;

import java.util.Scanner;

public class MultiDimenssionalArray {

	public static void main(String[] args) {
		takeInputFromConsole();
		additionOfColumnMatrix();
		trasposeOfMatrix();
	}

	public static void takeInputFromConsole() {
		Scanner sc = new Scanner(System.in);

		int value[][] = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				value[i][j] = sc.nextInt();
			}
		}

		sc.close();
		System.out.println("Multi-Dimenssional array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(value[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void additionOfColumnMatrix() {
		int value[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Addition of Matrix column :");
		for (int i = 0; i < 3; i++) {
			int add = 0;
			for (int j = 0; j < 3; j++) {

				add = add + value[i][j];
			}
			System.out.println(add);
		}
	}

	public static void trasposeOfMatrix() {
		int value[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int transpose[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = value[j][i];
			}
		}
		System.out.println("Transpose of Multi-Dimenssional array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
