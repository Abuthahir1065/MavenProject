package employee.map;

public class ModifyRecord extends AddRecord {
	public static void  modifyRecord(Employee emp) 
	{
		int choice;
		System.out.println("Enter the id of the record you want to modify..");
		int id = sc.nextInt();
		

		map.put(id, emp);	
		
	do {	
		System.out.println("Enter the field you want to modify:\n1.Id\n2.Name\n3.Department\n4.Designation\n5.Stop Editing");
		 choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Id: ");
			emp.setId(sc.nextInt());
		    break;
	case 2:
		System.out.println("Enter Name:");
		emp.setName(sc.next());
		break;
	case 3:
		System.out.println("Enter Department:");
		emp.setDepartment(sc.next());
		break;
	case 4:
		System.out.println("Enter Designation:");
		emp.setDesignation(sc.next());
		break;
	case 5:
		System.out.println("You have pressed 5.!!Editing has been done..!!");
		break;
	default:
		System.out.println("Wrong Choice..!!");
		break;
	}
	}while(choice!=5);
	}

}
