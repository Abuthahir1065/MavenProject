package employee.map;


import java.util.Map.Entry;
import java.util.Set;

public class DisplayRecords extends AddRecord{
	public void dispRecords()
	{  
		Set<Entry<Integer, Employee>> st = map.entrySet();
		for (Entry<Integer, Employee> me : st) { 
			
			System.out.println(me.getValue());

		}
	}

}


