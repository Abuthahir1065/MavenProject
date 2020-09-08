package employee.map;

public class SearchRecord extends AddRecord{
	public void searchRecords()
	{
		System.out.println("Enter the id of the record you want to search..");
		int id = sc.nextInt();
		if(map.containsKey(id))
		{
			Employee record = map.get(id);
			System.out.println(record);

		}
		else
		{
			System.out.println("Record not found!!");
		}
	} 

}
