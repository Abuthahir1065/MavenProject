package dowhile.calci;

//Calculator program using Do while loop
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		int choice;

		String operation = " ";
		do {
			System.out.println("Enter the first number: ");
			number1 = input.nextInt();
			System.out.println("Enter the second number: ");
			number2 = input.nextInt();
			System.out.println("================================");

			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");

			System.out.println("================================");
			choice = input.nextInt();
			Master object;

			switch (choice) {
			case 1:
				object = new Addition();
				operation = "+";
				System.out.println(number1 + " " + operation + " " + number2 + " " + "=" + " "
						+ object.getResult(number1, number2));
				System.out.println("================================");
				break;
			case 2:
				object = new Subtraction();
				operation = "-";
				System.out.println(number1 + " " + operation + " " + number2 + " " + "=" + " "
						+ object.getResult(number1, number2));
				System.out.println("================================");
				break;
			case 3:
				object = new Multiply();

				operation = "*";

				System.out.println(number1 + " " + operation + " " + number2 + " " + "=" + " "
						+ object.getResult(number1, number2));
				System.out.println("================================");
				break;
			case 4:
				object = new Division();

				operation = "/";

				System.out.println(number1 + " " + operation + " " + number2 + " " + "=" + " "
						+ object.getResult(number1, number2));
				System.out.println("================================");
				break;

			default:
				System.out.println("Wrong Choice...!!");
			}
			System.out.println("Press 5 to Exit\nPress 6 to continue");
			choice = input.nextInt();
		} while (choice != 5);
		System.out.println("You have pressed 5 ! The Program has been ended..!");
		input.close();
	}

}