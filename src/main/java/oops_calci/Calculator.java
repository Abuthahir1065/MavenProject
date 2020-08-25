package oops_calci;

//Calculator program using Hierarchical inheritance and Polymorphism (Overriding)

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2,choice,result=0;
	String operation=" ";
	
	System.out.println("Enter the first number: ");
	num1=sc.nextInt();
	System.out.println("Enter the second number: ");
	num2=sc.nextInt();
	System.out.println("================================");
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");
	System.out.println("================================");
	choice=sc.nextInt();
	
    Addition div=new Division();
    Addition add=new Addition();
    Addition mul=new Multiply();
    Addition sub=new Subtraction();
	switch(choice)
	{
	case 1:
		
		operation="+";
		result=add.getResult(num1, num2);
		break;
	case 2:
		
		operation="-";
		result=sub.getResult(num1, num2);
		break;
	case 3:
		operation="*";
		result=mul.getResult(num1, num2);
		break;	
	case 4:
		operation="/";
		result=div.getResult(num1, num2);
		break;	
	default:
		System.out.println("Invalid Choice...!!");
	
	}	
	System.out.println("================================");
	System.out.println(num1+" "+operation+" "+num2+" "+"="+" "+result);
	System.out.println("================================");
}
		
		
}