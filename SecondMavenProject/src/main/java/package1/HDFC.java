package package1;

import java.util.Scanner;

public class HDFC implements RBI{
	
	public void	recurringDeposit() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amout to be deposit ");
		int amt = sc.nextInt();
		System.out.println("Enter the period of time in months");
		int period = sc.nextInt();
		float total = ((amt*interestRate)/100)*period ;
		
		System.out.println("Total amount after the period of time is " + total);
	}

}
