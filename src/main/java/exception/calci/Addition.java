package exception.calci;

import java.util.Scanner;

public class Addition extends Calculator {

	void getResult(int number[]) {
		Scanner input = new Scanner(System.in);
		result = 0;
		try {
			for (index = 0; index < quantity; index++) {
				number[index] = input.nextInt();
			}
			for (index = 0; index < quantity; index++) {
				result = result + number[index];
			}

			System.out.println("Addition of all numbers is " + result);
			System.out.println("================================");
		} catch (Exception message) {
			System.out.println("InputMismatchException Occured");
			System.out.println(message);
		}

	}
}
