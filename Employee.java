public class Employee {

	private int Id;
	private String Name;
	private Department department;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
  
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", department="
				+ department + "]";
	}

	 
}
