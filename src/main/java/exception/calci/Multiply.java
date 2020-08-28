package exception.calci;
import java.util.Scanner;
public class Multiply extends Calculator 
{
	void getResult()
	{
		Scanner input = new Scanner(System.in);
		int result = 1;
		int quantity;
		int index;
		System.out.println("Enter the number of values you want to multiply: ");
		quantity = input.nextInt();
		int number[] = new int[quantity];
		try
		{
			System.out.println("Input " + quantity + " values");
			for (index = 0; index < quantity; index++)
			{
				number[index] = input.nextInt();
			}
			for (index = 0; index < quantity; index++)
			{
				result = result * number[index];
			}
			System.out.println("Multiplication of all numbers is " + result);
			System.out.println("================================");
		} 
		catch (Exception message)
		{
			System.out.println("InputMismatchException Occured");
			System.out.println(message);

		}
		input.close();
	}
}
