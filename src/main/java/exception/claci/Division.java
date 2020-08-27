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
     System.out.print("Enter " +n+" numbers: ");
     
      for(i = 0; i < n; i++) {
         
         divisionArray[i] = sc.nextDouble();
       
     
     
         
     }
    
     

     double result = divisionArray[0];
     
     for(k = 1; k < n; k ++) {
         
         if(divisionArray[k]==0)
         {
         throw new ArithmeticException("By Zero");
         }
         else
         {
        	 result = result / divisionArray[k];
         }
     
     }
     
     System.out.println("Division of all numbers is "+result);
     System.out.println("================================");

    
}
}
