package exception.calci;

import java.util.Scanner;

public class Division extends Calculator {
	void getResult(double divisionArray[]) {
		Scanner input = new Scanner(System.in);
		try {
			for (index = 0; index < quantity; index++) {
				System.out.print("Enter " + quantity + " numbers: ");
				divisionArray[index] = input.nextDouble();
			}
			double result = divisionArray[0];
			for (int index2 = 1; index2 < quantity; index2++) {

				if (divisionArray[index2] == 0) {
					throw new ArithmeticException("By Zero");
				} else {
					result = result / divisionArray[index2];
				}
			}
			System.out.println("Division of all numbers is " + result);
			System.out.println("================================");
		} catch (Exception message) {
			System.out.println("InputMismatchException Occured");
			System.out.println(message);
		}

	}
}
