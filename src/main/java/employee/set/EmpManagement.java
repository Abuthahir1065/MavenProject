package employee.set;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class EmpManagement {

	Set<Employee> employees = new HashSet<Employee>();
Scanner sc=new Scanner(System.in);
	public EmpManagement() {

	}

	public void add(Employee emp) {
		employees.add(emp);
	}

	
	
	public void printAllEmpData() {
		employees.forEach(emp -> System.out.println(emp));
	}

	public boolean delete(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}
	public void search(int id)
	{
		for(Employee employee:employees)
		{
			if(employee.getId()==id) {
				
		   System.out.println(employee);
			}
		}
		
	}

}
