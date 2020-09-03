package employeedata;


import java.util.List;

import java.util.Map.Entry;

public class DisplayEmployeeRecord extends Employee {
	void displayRecord()

	{
		System.out.println("ID | NAME | DEPARMENT | DESIGNATION");
		System.out.println("=================================");

		for (Entry<Object, List<String>> m : map.entrySet()) {
			System.out.print(m.getKey());
			System.out.print(m.getValue() + "\n\n");
		}

	}
}
