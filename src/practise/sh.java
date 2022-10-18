package practise;

public class sh {

	 public static void main(String args[]) 
	    
	    {
	      
	         int a[] = {10,20,20,30,30,40,50,50,67,75,75};
	       
	         for(int i=0; i<a.length-1; i++)
	         {
	             if(a[i]!=a[i+1])
	             {
	                System.out.println(a[i]);
	             }
	         }
	   
	        System.out.println(a[a.length-1]);        
	    }
}
