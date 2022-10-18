package practise;

public class ArrayOccurence1 {

	public static void main(String[] args) {
		int a[] = { 3, 6, 5, 1, 2, 4, 3, 3, 2, 3 };
		int temp[] = new int[a.length];
		int val = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					temp[j] = val;
				}
			}
			if (temp[i] != val) {
				temp[i] = count;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != val) {
				System.out.println(a[i] + "  repeated " + temp[i] + " times");
			}
		}
	}
}
