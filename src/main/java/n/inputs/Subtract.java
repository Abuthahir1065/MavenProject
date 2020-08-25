package n.inputs;
import java.util.Scanner;
public class Subtract extends Calculator {
	void getResult()
	{
		Scanner sc=new Scanner(System.in);
		 int result=0;
		 int n;
		 int i;
		 int num[] = new int[100];
	System.out.println("Enter the number of values you want to Subtract: ");
	n=sc.nextInt();
	System.out.println("Input "+n+" values");
	for(i=0;i<n;i++)
	{
		num[i]=sc.nextInt();
	}
	
	 result = num.length > 0 ? num[0] : 0;
	  for ( i = 1; i< num.length; i++ ) {
	    result -= num[i]; 
	  }
	System.out.println("Subtraction of all numbers is "+result);

	System.out.println("================================");

}
	
}
