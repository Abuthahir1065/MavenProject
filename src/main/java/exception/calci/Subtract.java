package exception.calci;

import java.util.Scanner;

public class Subtract extends Calculator {
	void getResult(int number2[]) {
		Scanner input = new Scanner(System.in);
		try {
			for (index = 0; index < quantity; index++) {
				number2[index] = input.nextInt();
			}
			result = number2.length > 0 ? number2[0] : 0;
			for (index = 1; index < number2.length; index++) {
				result -= number2[index];
			}
			System.out.println("Subtraction of all numbers is " + result);
			System.out.println("================================");
		} catch (Exception message) {
			System.out.println("InputMismatchException Occured");
			System.out.println(message);
		}
	}
}
