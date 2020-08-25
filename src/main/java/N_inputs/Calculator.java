package N_inputs;

//Calculator program using N inputs

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
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
	choice=sc.nextInt();
	
	
	
    switch(choice)
	{
	case 1:
		Addition add=new Addition();
		add.getResult();
		
		break;
	case 2:
		Subtract sub=new Subtract();
		sub.getResult();
		break;
	case 3:
		Multiply mul = new Multiply();
		mul.getResult();
		break;
	case 4:
		Division div = new Division();
		div.getResult();
		break;
	case 5:
		Evaluation evl=new Evaluation();
		evl.getResult();
		break;
		
	case 6:
		System.out.println("You have pressed 6. The program has ended..!!");
		
		break;
	default:
		System.out.println("Wrong Choice...!!");
		
	 }	
   }while(choice!=6);
 }
		
}