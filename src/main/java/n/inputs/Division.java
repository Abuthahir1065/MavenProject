package n.inputs;

public class Division extends Calculator {
	void getResult(double divisionArray[]) {

		double result = divisionArray[0];
		for (int index2 = 1; index2 < quantity; index2++) {
			result = result / divisionArray[index2];
		}
		System.out.println("Division of all numbers is " + result);
		System.out.println("================================");

	}
}
