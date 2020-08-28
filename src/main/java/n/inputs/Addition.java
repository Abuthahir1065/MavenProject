package n.inputs;

import java.util.Scanner;

public class Addition extends Calculator 
{
	void getResult()
	{
		Scanner input = new Scanner(System.in);
		int result = 0;
		int quantity;
		int index;
		System.out.println("Enter the number of values you want to add: ");
		quantity = input.nextInt();
		int number[] = new int[quantity];
		System.out.println("Input " + quantity + " values");
		for (index = 0; index < quantity; index++) 
		{
			number[index] = input.nextInt();
		}
		for (index = 0; index < quantity; index++) 
		{
			result = result + number[index];
		}
		System.out.println("Addition of all numbers is " + result);
		System.out.println("================================");
		input.close();
	}
}
