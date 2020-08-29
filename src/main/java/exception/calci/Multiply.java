package exception.calci;

import java.util.Scanner;

public class Multiply extends Calculator {
	void getResult(int number3[]) {
		Scanner input = new Scanner(System.in);
		result = 1;
		try {
			for (index = 0; index < quantity; index++) {
				number3[index] = input.nextInt();
			}
			for (index = 0; index < quantity; index++) {
				result = result * number3[index];
			}
			System.out.println("Multiplication of all numbers is " + result);
			System.out.println("================================");

		} catch (Exception message) {
			System.out.println("InputMismatchException Occured");
			System.out.println(message);
		}
	}
}
