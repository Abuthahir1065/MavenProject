package employee.map;

public class DeleteRecord extends AddRecord{
	public void deleteRecords()
	{
		System.out.println("Enter the id of the record you want to delete..");
		int id = sc.nextInt();
		map.remove(id);
		System.out.println("Record deleted...");
		System.out.println("==================================================");
	}
}