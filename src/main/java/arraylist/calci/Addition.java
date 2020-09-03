package arraylist.calci;

import java.util.ArrayList;

public class Addition extends Calculator {
	void getResult(ArrayList<Integer> list) {
		result = 0;
		for (index = 0; index < list.size(); index++) {
			result = result + list.get(index);
		}
		System.out.println("Addition of all numbers is " + result);
		System.out.println("================================");

	}

}
