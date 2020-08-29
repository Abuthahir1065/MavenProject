package n.inputs;

//Calculator program using N inputs
import java.util.Scanner;

public class Calculator {

	static int quantity;
	static int index;
	static int choice;
	static int result;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Evaluating Expression");
			System.out.println("Press 6 for Exit ");
			System.out.println("================================");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the number of values you want to add: ");
				quantity = input.nextInt();
				int number[] = new int[quantity];
				System.out.println("Input " + quantity + " values");
				for (index = 0; index < quantity; index++) {
					number[index] = input.nextInt();
				}
				Addition add = new Addition();
				add.getResult(number);
				break;
			case 2:
				System.out.println("Enter the number of values you want to subtract: ");
				quantity = input.nextInt();
				int number2[] = new int[quantity];
				System.out.println("Input " + quantity + " values");
				for (index = 0; index < quantity; index++) {
					number2[index] = input.nextInt();
				}
				Subtract subtract = new Subtract();
				subtract.getResult(number2);
				break;
			case 3:
				System.out.println("Enter the number of values you want to multiply: ");
				quantity = input.nextInt();
				int number3[] = new int[quantity];
				System.out.println("Input " + quantity + " values");
				for (index = 0; index < quantity; index++) {
					number3[index] = input.nextInt();
				}
				Multiply multiply = new Multiply();
				multiply.getResult(number3);
				break;
			case 4:
				System.out.println("How many numbers do you want to divide? ");
				quantity = input.nextInt();
				double[] divisionArray = new double[quantity];
				for (index = 0; index < quantity; index++) {
					System.out.print("Enter " + quantity + " numbers: ");
					divisionArray[index] = input.nextDouble();
				}
				Division division = new Division();
				division.getResult(divisionArray);
				break;
			case 5:
				Evaluation evaluate = new Evaluation();
				evaluate.getResult();
				break;
			case 6:
				System.out.println("You have pressed 6. The program has ended..!!");
				break;
			default:
				System.out.println("Wrong Choice...!!");
			}
		} while (choice != 6);
	}
}
