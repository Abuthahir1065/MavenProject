package dowhile.calci;

//Calculator program using Do while loop

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2;
    int choice;
    int result=0;
    int n;
    int i;
    int num[] = new int[100];
	
	String operation=" ";
	do
	{
		
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");
	System.out.println("Press 5 for Exit");
	System.out.println("================================");
	choice=sc.nextInt();
	
	Master object;
	
    switch(choice)
	{
	case 1:
		object=new Addition();
		System.out.println("Enter the number of values you want to add: ");
		n=sc.nextInt();
		System.out.println("Input "+n+" values");
		for(i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			result=result+num[i];
		}
		System.out.println("Addition of all numbers is "+result);
	/*	System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		System.out.println("================================");
		
		operation="+";
		result=object.getResult(num1, num2);
		System.out.println(num1+" "+operation+" "+num2+" "+"="+" "+result);*/
		System.out.println("================================");
		break;
	case 2:
		object=new Subtraction();
		System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		System.out.println("================================");
		
		operation="-";
		result= object.getResult(num1, num2);
		System.out.println(num1+" "+operation+" "+num2+" "+"="+" "+result);
		System.out.println("================================");
		break;
	case 3:
		object=new Multiply();
		System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		System.out.println("================================");
		
		operation="*";
		result= object.getResult(num1, num2);
		System.out.println(num1+" "+operation+" "+num2+" "+"="+" "+result);
		System.out.println("================================");
		break;	
	case 4:
		object=new Division();
		System.out.println("Enter the first number: ");
		num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		num2=sc.nextInt();
		System.out.println("================================");
		
		operation="/";
		result= object.getResult(num1, num2);
		System.out.println(num1+" "+operation+" "+num2+" "+"="+" "+result);
		System.out.println("================================");
		break;
	case 5:
		System.out.println("You have pressed 5. The program has ended..!!");
		
		break;
	default:
		System.out.println("Wrong Choice...!!");
		
	 }	
   }while(choice!=5);
 }
		
		}