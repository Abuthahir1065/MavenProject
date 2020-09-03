package employee.arraylist;

import java.util.ArrayList;

public class SearchEmployeeRecord extends Employee {

	void searchRecord() {
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the id of the employee you want to search from the list");
		id = input.nextInt();

		System.out.println("ID | NAME | DEPARMENT | DESIGNATION");
		System.out.println("=================================");
       System.out.println(list.get(id)); 
		
	}
}
