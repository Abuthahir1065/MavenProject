package exception.calci;
import java.util.Scanner;
public class Subtract extends Calculator {
	void getResult()
	{
		Scanner input=new Scanner(System.in);
		 int result=0;
		 int quantity;
		 int index;
		 
	System.out.println("Enter the number of values you want to Subtract: ");
	quantity=input.nextInt();
	int number[] = new int[quantity];
	try
	{
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
	}
	catch(Exception message)
	{
		System.out.println("InputMismatchException Occured");
		System.out.println(message);
	}
	input.close();

}
	
}
