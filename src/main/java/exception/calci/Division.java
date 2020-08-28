package exception.calci;
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
		System.out.print("Enter " + quantity + " numbers: ");
		for (index = 0; index < quantity; index++) 
		{
			divisionArray[index] = input.nextDouble();
		}
		double result = divisionArray[0];
		for (index2 = 1; index2 < quantity; index2++) 
		{
			if (divisionArray[index2] == 0)
			{
				throw new ArithmeticException("By Zero");
			}
			else
			{
				result = result / divisionArray[index2];
			}
		}
		System.out.println("Division of all numbers is " + result);
		System.out.println("================================");
		input.close();
	}
}
