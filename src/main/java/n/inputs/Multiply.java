package n.inputs;

public class Multiply extends Calculator {
	void getResult(int number3[]) {
		result = 1;
		for (index = 0; index < quantity; index++) {
			result = result * number3[index];
		}
		System.out.println("Multiplication of all numbers is " + result);
		System.out.println("================================");

	}
}
