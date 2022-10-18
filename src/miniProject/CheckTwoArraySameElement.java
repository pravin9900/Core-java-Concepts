package miniProject;

public class CheckTwoArraySameElement {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};

        int []arr2 = {1, 2, 3, 4, 5};
        int length = arr1.length;
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
        	if(arr1[i]==arr2[i])
        	{
        		count++;
        	}
        }
        if(count == length)
        {
        	System.out.println("Two array contains same element.");
        }else {
        	System.out.println("Two array contains different element.");
        }
	}
}
