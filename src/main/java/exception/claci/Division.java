package exception.claci;

import java.util.Scanner;

public class Division extends Calculator{
	
	void getResult()
	{
	 Scanner sc = new Scanner(System.in);
     int n,i,k;
     System.out.println("How many numbers do you want to divide? ");
     n=sc.nextInt();
     double[] divisionArray = new double[n];
try {
     for(i = 0; i < n; i++) {
         System.out.print("Enter " +n+" numbers: ");
         divisionArray[i] = sc.nextDouble();
         if(divisionArray[n]==0)
         {
        	 throw new ArithmeticException();
         }
     
     
         sc.close();
     }
    
     

     double result = divisionArray[0];
     
     for(k = 1; k < n; k ++) {
         result = result / divisionArray[k];
        
     
     }
     
     System.out.println("Division of all numbers is "+result);
     System.out.println("================================");
}
catch(Exception e)
{
	System.out.println("InputMismatchException Occured");
	System.out.println(e);
}

}
}
