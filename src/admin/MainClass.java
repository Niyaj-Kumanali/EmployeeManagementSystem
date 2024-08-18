package admin;

import repository.EmployeeDB;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = EmployeeCreation.create("Niyaz", 100000, 10);
		Employee e2 = EmployeeCreation.create("Shubham",1456578, 35);
		Employee e3 = EmployeeCreation.create("Junaid", 1454000, 20);
		Employee e4 = EmployeeCreation.create("Prathamesh",1566478, 55);
		Employee e5 = EmployeeCreation.create("Faizan", 1536700, 17);
		Employee e6 = EmployeeCreation.create("Sourabh",1456678, 5);
		
		EmployeeDB db = new EmployeeDB(6);
		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);
		db.addEmployee(e4);
		db.addEmployee(e5);
		db.addEmployee(e6);

		db.viewEmployeeRecords();
		
		Employee emp1 = db.getEmployee(1007);
		
		System.out.println(emp1==null? "Employee Not found":emp1);
	}

}
