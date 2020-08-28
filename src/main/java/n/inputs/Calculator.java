package n.inputs;

//Calculator program using N inputs

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	
    int choice;
   
	
	
	do
	{
		
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");
	System.out.println("Press 5 for Evaluating Expression");
	System.out.println("Press 6 for Exit ");
	System.out.println("================================");
	choice=input.nextInt();
	
	
	
    switch(choice)
	{
	case 1:
		Addition add=new Addition();
		add.getResult();
		
		break;
	case 2:
		Subtract subtract=new Subtract();
		subtract.getResult();
		break;
	case 3:
		Multiply multiply = new Multiply();
		multiply.getResult();
		break;
	case 4:
		Division division = new Division();
		division.getResult();
		break;
	case 5:
		Evaluation evaluate=new Evaluation();
		evaluate.getResult();
		break;
		
	case 6:
		System.out.println("You have pressed 6. The program has ended..!!");
		
		break;
	default:
		System.out.println("Wrong Choice...!!");
		
	 }	
   }while(choice!=6);
	input.close();
 }
		
}