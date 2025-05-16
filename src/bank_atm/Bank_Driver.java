package bank_atm;

import java.util.Scanner;

public class Bank_Driver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ente bank name to open account");
		String bname=s.next();
		System.out.println("Enter address of bank"); 
		String loc=s.next();
		System.out.println("Enter back ifsc_code");
		String ifcs=s.next();
		Bank b = new Bank(bname,loc,ifcs);
		
		boolean option = true;
		while(option)
		{
			System.out.println("Enter your choice");
			System.out.println("enter 1. for create account");
			System.out.println("enter 2. for check details");
			System.out.println("enter 3. for deposite money");
			System.out.println("enter 4. for withdraw money");
			System.out.println("enter 5. for delete account");
			System.out.println("enter 6. for exit & close");

			int choice = s.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("enter name");
				String name=s.next();
				System.out.println("enter dob");
                String dob=s.next();
				System.out.println("enter pin");
                String pin=s.next();
				System.out.println("enter money to deposite");
                double money=s.nextDouble();
				System.out.println("enter account number of your choice");
                long ano=s.nextLong();
                b.createAccount(new Account(name, dob, pin, money, ano));
				System.out.println("======================================");
            }
			
			}
		}
	}

}
