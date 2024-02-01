package package1;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSuper cf = new Contractor();
		cf.calculateSalary();
		EmployeeSuper fe = new FullTimeEmployee();
		fe.calculateSalary();

	}

}
