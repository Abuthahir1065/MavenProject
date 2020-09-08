package employee.map;

public class Employee {

	int id;
	String name;
	String department;
	String designation;

	public Employee(int id, String name, String department, String designation) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation + ","
				+ "]";
	}

}
