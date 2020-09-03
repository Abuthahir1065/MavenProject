package employeedata;



public class SearchEmployeeRecord extends Employee {

	void searchRecord() {
		
		System.out.println("Enter the id of the employee you want to search from the list");
		id = input.nextInt();
		if (map.containsKey(id)) {
			System.out.println("ID | NAME | DEPARMENT | DESIGNATION");
			System.out.println("=================================");
            System.out.println(id);
			System.out.print( map.get(id) + "\n\n");
			System.out.println("Record has been found...!");
		} else {
			System.out.println("Record Not found..!!");
		}
		
	}
}
