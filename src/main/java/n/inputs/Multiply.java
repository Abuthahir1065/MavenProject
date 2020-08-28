package n.inputs;
import java.util.Scanner;
public class Multiply extends Calculator {
	void getResult()
	{
		Scanner input=new Scanner(System.in);
	    int result=1;
		 int quantity;
		 int index;
		 int number[] = new int[100];
	System.out.println("Enter the number of values you want to multiply: ");
	quantity=input.nextInt();
	System.out.println("Input "+quantity+" values");
	for(index=0;index<quantity;index++)
	{
		number[index]=input.nextInt();
	}
	
	for(index=0;index<quantity;index++)
	{
		result=result*number[index];
	}
	System.out.println("Multiplication of all numbers is "+result);

	System.out.println("================================");
    input.close();
}

}
