package employee.map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	static String name, department, designation, salary;
	static int id;

	static Scanner sc;
	static String option;
	static Map<Integer, Employee> map;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int input;
		sc = new Scanner(System.in);
		map = new HashMap<Integer, Employee>();
		do {
			System.out.println(
					"Choose your option..\n1.Add a record \n2.Search a record with id \n3.Delete record with id \n4.Display all records\n5.Modify Records\n6.Exit\n");
			input = sc.nextInt();
			switch (input) {
			case 1: {
				System.out.println("Enter Id: ");
				id = sc.nextInt();
				System.out.println("Enter the Name: ");
				name = sc.next();
				System.out.println("Enter the Department: ");
				department = sc.next();
				System.out.println("Enter the Designation: ");
				designation = sc.next();
				System.out.println("Enter the Salary: ");
				salary = sc.next();

				Employee emp = new Employee(id, name, department, designation,salary);
				AddRecord.add(emp);
				System.out.println("Record added successfully!!");
				System.out.println("==================================================");
				break;
			}
			case 2: {
				SearchRecord sr = new SearchRecord();
				sr.searchRecords();
				System.out.println("==================================================");
				break;
			}
			case 3: {
				DeleteRecord d = new DeleteRecord();
				d.deleteRecords();

				break;
			}

			case 4: {
				DisplayRecords d = new DisplayRecords();
				d.dispRecords();
				System.out.println("==================================================");
				break;
			}
			case 5:
				Employee emp = new Employee(id, name, department, designation,salary);
				ModifyRecord.modifyRecord(emp);
				System.out.println("==================================================");
				break;
			case 6:
				System.out.println("You have pressed 6..!The program has been ended..!!");
				System.out.println("==================================================");
				break;
			default: {
				System.out.println("Invalid selection ");
			}
			}

		} while (input != 6);

	}
}
