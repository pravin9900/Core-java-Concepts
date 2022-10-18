package InterviewQue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqFromArray {

	public static void main(String[] args) {

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}

				System.out.print(a[i] + "___");

				System.out.println(k);
				if (k == 1)
					System.out.println(a[i] + " is unique number");
			}
		}
		uniqElement();
	}
	public static void uniqElement()
	{
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		Set<Integer> set = new HashSet<Integer>();
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(set.contains(a[i]))
			{
				k++;
			}
			set.add(a[i]);
		}
		System.out.println(k);
		System.out.println(set );
	}
}
