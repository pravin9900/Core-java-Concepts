package miniProject;

import java.util.Scanner;

public class Demo {

	static void max(String str)
    {
        str= str.replace("{", "");
        str= str.replace("}", "");
        String[] split2= str.split(", ");
        int a[]= new int[split2.length];
        
        for(int i=0; i<split2.length; i++)
        {
            a[i] = Integer.parseInt(split2[i]);
        }
        
        int temp;
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
               if(a[i]>a[j])
               {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
               }
            }
        }
        System.out.println(a[a.length-2]);
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        max(str);

    }
    
}
