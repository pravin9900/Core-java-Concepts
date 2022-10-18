package practise;

public class ArrayOccurence {

	public static void main(String args[])

	{
		int x[] = { 2, 4,2,  6, 2 ,2};

		int temp[] = new int[x.length];

		int val = -1;

		for (int i = 0; i < x.length; i++) {
			int count = 1;

			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
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
				System.out.println(x[i] +  "   Repeated " + temp[i]  + "  Times");
			}
		}
	}
}
