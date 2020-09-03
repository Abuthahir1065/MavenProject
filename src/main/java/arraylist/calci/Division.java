package arraylist.calci;

import java.util.ArrayList;

public class Division extends Calculator {
	void getResult(ArrayList<Integer> list) {

		result = list.get(0);
		for (index = 0; index < list.size() - 1; index++) {
			result = result / list.get(index + 1);
		}
		System.out.println("Result: " + result);
		System.out.println("================================");
	}
}
