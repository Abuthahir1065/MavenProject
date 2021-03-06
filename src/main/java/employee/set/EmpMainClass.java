package employee.set;

import java.util.Scanner;

public class EmpMainClass {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new EmpMainClass().testEmpManagement();
	}

	public void testEmpManagement() {
		int choice;

		EmpManagement empManagement = new EmpManagement();
		do {
			System.out.println("Enter your choice \n1.Add Record\n2.Show All Records\n3.Delete Record\n4.Search Record\n5.Modify Records\n6.Exit\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				System.out.println("Enter the Name: ");
				String name = sc.next();
				System.out.println("Enter the Department: ");
				String department = sc.next();
				System.out.println("Enter the Designation: ");
				String designation = sc.next();
				System.out.println("Enter the Salary: ");
				String salary = sc.next();
				Employee emp = new Employee(id, name, department, designation,salary);
				empManagement.addRecord(emp);
				System.out.println("Record has been added..!!");
				System.out.println("==================================");
				break;
			case 2:

				empManagement.printAllEmpData();
				System.out.println("==================================");
				break;
			case 3:
				System.out.println("Enter the Id you want to delete the record:");
				id = sc.nextInt();
				empManagement.delete(id);
				System.out.println("Record has been deleted..!");
				System.out.println("==================================");
				break;
			case 4:
				System.out.println("Enter the Id you want to Search:");
				id = sc.nextInt();
				empManagement.search(id);
				System.out.println("==================================");
				break;
			case 5:
				System.out.println("Enter the Id you want to Modify:");
				id = sc.nextInt();
				empManagement.modify(id);
				System.out.println("Record has been Modified..!!");
				System.out.println("==================================");
				break;
			case 6:
				System.out.println("You have Pressed 6..The program has been ended..!!");
				System.out.println("==================================");
				break;

			default:
				System.out.println("Wrong Choice...!!");
				break;
			}
		} while (choice != 6);
	}

}
