package Basic_Calci;

import java.util.Scanner;

public class Arithmetic_Operations {

	public static void main(String[] args) {
		int num1,num2;
		int result = 0;
		
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			result=num1+num2;
			break;
		case 2:
			result=num1-num2;
			break;
		case 3:
			result=num1*num2;
			break;
		case 4:
			result=num1/num2;
			break;
		default:
			System.out.println("Press the valid number..!!");
			
			
			
		}
		System.out.println("Result is "+result);

	}

}
