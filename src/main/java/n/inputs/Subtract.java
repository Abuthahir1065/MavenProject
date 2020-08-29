package n.inputs;

public class Subtract extends Calculator {
	void getResult(int number2[]) {

		result = number2.length > 0 ? number2[0] : 0;
		for (index = 1; index < number2.length; index++) {
			result -= number2[index];
		}
		System.out.println("Subtraction of all numbers is " + result);
		System.out.println("================================");

	}
}
