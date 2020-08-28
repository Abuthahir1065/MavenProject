package dowhile.calci;

//Calculator program using Do while loop

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int number1,number2;
    int choice;
    int result=0;
    int quantity;
    int index;
    int number[] = new int[100];
	
	String operation=" ";
	do
	{
		
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");
	System.out.println("Press 5 for Exit");
	System.out.println("================================");
	choice=input.nextInt();
	
	Master object;
	
    switch(choice)
	{
	case 1:
		object=new Addition();
		System.out.println("Enter the number of values you want to add: ");
		quantity=input.nextInt();
		System.out.println("Input "+quantity+" values");
		for(index=0;index<quantity;index++)
		{
			number[index]=input.nextInt();
		}
		
		for(index=0;index<quantity;index++)
		{
			result=result+number[index];
		}
		System.out.println("Addition of all numbers is "+result);
	
		System.out.println("================================");
		break;
	case 2:
		object=new Subtraction();
		System.out.println("Enter the first number: ");
		number1=input.nextInt();
		System.out.println("Enter the second number: ");
		number2=input.nextInt();
		System.out.println("================================");
		
		operation="-";
		result= object.getResult(number1, number2);
		System.out.println(number1+" "+operation+" "+number2+" "+"="+" "+result);
		System.out.println("================================");
		break;
	case 3:
		object=new Multiply();
		System.out.println("Enter the first number: ");
		number1=input.nextInt();
		System.out.println("Enter the second number: ");
		number2=input.nextInt();
		System.out.println("================================");
		
		operation="*";
		result= object.getResult(number1, number2);
		System.out.println(number1+" "+operation+" "+number2+" "+"="+" "+result);
		System.out.println("================================");
		break;	
	case 4:
		object=new Division();
		System.out.println("Enter the first number: ");
		number1=input.nextInt();
		System.out.println("Enter the second number: ");
		number2=input.nextInt();
		System.out.println("================================");
		
		operation="/";
		result= object.getResult(number1, number2);
		System.out.println(number1+" "+operation+" "+number2+" "+"="+" "+result);
		System.out.println("================================");
		break;
	case 5:
		System.out.println("You have pressed 5. The program has ended..!!");
		
		break;
	default:
		System.out.println("Wrong Choice...!!");
		
	 }	
   }while(choice!=5);
	input.close();
 }
		
		}