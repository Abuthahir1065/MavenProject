package basic.calci;

import java.util.Scanner;

public class ArithmeticOperations
{

	public static void main(String[] args) 
	{
		int number1,number2;
		int result = 0;
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1=input.nextInt();
		System.out.println("Enter the second number:");
		number2=input.nextInt();
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		choice=input.nextInt();
		switch(choice)
		{
		case 1:
			result=number1+number2;
			break;
		case 2:
			result=number1-number2;
			break;
		case 3:
			result=number1*number2;
			break;
		case 4:
			result=number1/number2;
			break;
		default:
			System.out.println("Press the valid number..!!");
		}
		System.out.println("Result is "+result);
       input.close();
	}
}
