package employee.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpManagement {

	List<Employee> employees = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);

	public EmpManagement() {

	}

	public void add(Employee emp) {
		employees.add(emp);
	}

	public List<Employee> getAll() {
		return employees;
	}

	public void printAllEmpData() {
		employees.forEach(emp -> System.out.println(emp));
	}

	public boolean delete(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				employees.remove(employees.indexOf(employee));
				return true;
			}
		}
		return false;
	}

	public void search(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {

				System.out.println(employees.get(employees.indexOf(employee)));
			}
		}

	}

}
