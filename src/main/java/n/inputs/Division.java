package n.inputs;

import java.util.Scanner;

public class Division extends Calculator{
	
	void getResult()
	{
	 Scanner sc = new Scanner(System.in);
     int n,i,k;
     System.out.println("How many numbers do you want to divide? ");
     n=sc.nextInt();
     double[] divisionArray = new double[n];

     for(i = 0; i < n; i++) {
         System.out.print("Enter " +n+" numbers: ");
         divisionArray[i] = sc.nextDouble();
     }

     double result = divisionArray[0];
     for(k = 1; k < n; k ++) {
         result = result / divisionArray[k];
     }
     System.out.println("Division of all numbers is "+result);
     System.out.println("================================");
}
}
