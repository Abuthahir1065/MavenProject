package n.inputs;
import java.util.Scanner;
public class Subtract extends Calculator {
	void getResult()
	{
		Scanner input=new Scanner(System.in);
		 int result=0;
		 int quantity;
		 int index;
		 int number[] = new int[100];
	System.out.println("Enter the number of values you want to Subtract: ");
	quantity=input.nextInt();
	System.out.println("Input "+quantity+" values");
	for(index=0;index<quantity;index++)
	{
		number[index]=input.nextInt();
	}
	
	 result = number.length > 0 ? number[0] : 0;
	  for ( index = 1; index< number.length; index++ ) {
	    result -= number[index]; 
	  }
	System.out.println("Subtraction of all numbers is "+result);

	System.out.println("================================");
    input.close();
}
	
}
