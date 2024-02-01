package package1;

import java.util.Scanner;

public class Contractor extends EmployeeSuper{
	
	public void calculateSalary() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Contractor Working hours ");
		float hr = sc.nextFloat();		
		float sal = hr*100;
		
		System.out.println("Salary of Contractor is: " + sal);
		
	}

}
