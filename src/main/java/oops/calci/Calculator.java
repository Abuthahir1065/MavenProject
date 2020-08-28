package oops.calci;

//Calculator program using Hierarchical inheritance and Polymorphism (Overriding)

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int number1,number2,choice,result=0;
	String operation=" ";
	
	System.out.println("Enter the first number: ");
	number1=input.nextInt();
	System.out.println("Enter the second number: ");
	number2=input.nextInt();
	System.out.println("================================");
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");
	System.out.println("================================");
	choice=input.nextInt();
	
    Addition division=new Division();
    Addition add=new Addition();
    Addition multiply=new Multiply();
    Addition subtract=new Subtraction();
	switch(choice)
	{
	case 1:
		
		operation="+";
		result=add.getResult(number1, number2);
		break;
	case 2:
		
		operation="-";
		result=subtract.getResult(number1, number2);
		break;
	case 3:
		operation="*";
		result=multiply.getResult(number1, number2);
		break;	
	case 4:
		operation="/";
		result=division.getResult(number1, number2);
		break;	
	default:
		System.out.println("Invalid Choice...!!");
	
	}	
	System.out.println("================================");
	System.out.println(number1+" "+operation+" "+number2+" "+"="+" "+result);
	System.out.println("================================");
	input.close();
}
		
		
}