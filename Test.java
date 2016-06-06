
public class Test {

	public static void main(String[] args) {
		
		Employee employee= new Employee();
		employee.setId(202);
		employee.setName("Forhad");
		
		
		Department department= new Department();
		department.setId(500);
		department.setDepartmnetName("IT");
		 
		employee.setDepartment(department);
		
		System.out.println(employee);
	}
	
	 
	 
}
