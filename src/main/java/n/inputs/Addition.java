package n.inputs;

public class Addition extends Calculator {
	void getResult(int number[]) {
		result = 0;
		for (index = 0; index < quantity; index++) {
			result = result + number[index];
		}
		System.out.println("Addition of all numbers is " + result);
		System.out.println("================================");

	}
}
