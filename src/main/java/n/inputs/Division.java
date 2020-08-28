package n.inputs;

import java.util.Scanner;

public class Division extends Calculator 
{
	void getResult()
	{
		Scanner input = new Scanner(System.in);
		int quantity, index, index2;
		System.out.println("How many numbers do you want to divide? ");
		quantity = input.nextInt();
		double[] divisionArray = new double[quantity];
		for (index = 0; index < quantity; index++) 
		{
			System.out.print("Enter " + quantity + " numbers: ");
			divisionArray[index] = input.nextDouble();
		}
		double result = divisionArray[0];
		for (index2 = 1; index2 < quantity; index2++) 
		{
			result = result / divisionArray[index2];
		}
		System.out.println("Division of all numbers is " + result);
		System.out.println("================================");
		input.close();
	}
}
