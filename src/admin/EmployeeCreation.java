package admin;

public class EmployeeCreation {
	
	private static int id = 1001;
	
	public static Employee create (String name, double salary, double exp) {
		return new Employee(id++, name, salary, exp);
	}

}
