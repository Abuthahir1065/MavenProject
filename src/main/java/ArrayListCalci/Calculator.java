package ArrayListCalci;

import java.util.ArrayList;
//Calculator program using ArrayLists
import java.util.Scanner;

public class Calculator {

	static int index;

	static int result;

	public static void main(String[] args) {
		int choice;

		do {

			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Exit ");
			System.out.println("================================");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();

			ArrayList<Integer> list = new ArrayList<Integer>();
			if (choice > 0 && choice <= 4) {
				System.out.println("Enter the number of values you want to perform operation: ");
				int quantity = input.nextInt();
				System.out.println("Enter " + quantity + " inputs:");
				for (index = 0; index < quantity; index++) {
					int values = input.nextInt();
					list.add(values);
				}

			}
			switch (choice) {

			case 1:

				Addition add = new Addition();
				add.getResult(list);
				break;
			case 2:

				Subtract subtract = new Subtract();
				subtract.getResult(list);
				break;
			case 3:

				Multiply multiply = new Multiply();
				multiply.getResult(list);
				break;
			case 4:

				Division division = new Division();
				division.getResult(list);
				break;

			case 5:
				System.out.println("You have pressed 5. The program has ended..!!");
				break;
			default:
				System.out.println("Wrong Choice...!!");
				System.out.println("================================");
			}
		} while (choice != 5);
	}
}
