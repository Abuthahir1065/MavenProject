package oops.calci;

public class Division extends Calculator {
	int getResult(int number1, int number2) {
		operation = "/";
		return number1 / number2;
	}
}
