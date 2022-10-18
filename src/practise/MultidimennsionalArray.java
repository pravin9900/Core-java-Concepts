package practise;

public class MultidimennsionalArray {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		additionOfColumnMatrix(a);
		transposeOfMatrix(a);
	}

	public static void additionOfColumnMatrix(int a[][]) {
		for (int i = 0; i < 3; i++) {
			int add = 0;
			for (int j = 0; j < 3; j++) {
				add = add + a[i][j];
			}
			System.out.println(add);
		}
	}

	public static void transposeOfMatrix(int a[][]) {
		int t[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				t[i][j] = a[j][i];
			}
		}
		System.out.println("Transpose of matrix : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(t[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
