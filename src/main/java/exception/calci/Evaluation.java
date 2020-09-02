package exception.calci;

import java.util.Scanner;

public class Evaluation extends Calculator {

	public static int evaluate(String expression) {

		String operands[] = expression.split("[\\+\\-\\*\\/]");
		String operators[] = expression.split("\\d+");
		result = 0;

		for (index = 0; index < operators.length; index++) {
			int currentValue = Integer.parseInt(operands[index]);
			if (operators[index].equals("+"))
				result = result + currentValue;
			else if (operators[index].equals("-"))
				result = result - currentValue;
			else if (operators[index].equals("*"))
				result = result * currentValue;
			else if (operators[index].equals("/"))
				result = result / currentValue;
			else
				result = result + currentValue;
		}
		return result;
	}

	void getResult() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your Expression");
		String expression = input.next();
		int result = evaluate(expression);
		System.out.println("Value of the expression is " + result);
		System.out.println("========================================");

	}

}
