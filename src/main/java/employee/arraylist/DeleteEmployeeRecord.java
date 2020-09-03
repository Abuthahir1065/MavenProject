package employee.arraylist;

import java.util.ArrayList;

public class DeleteEmployeeRecord extends Employee {

	void deleteRecord() {
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the id of the employee you want to delete from the list");
		id = input.nextInt();
        list.remove(id);
		
		System.out.println("Record has been deleted...!");
		
	}

}
