package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		//Account acc = new Account(01, "Lucas", 10.0);
		BusinessAccount bacc = new BusinessAccount(02, "Lorena", 0.0, 300.0);
		
		//Upcasting
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(03, "Jose", 100.0, 500.0);
		Account acc3 = new SavingsAccount(04, "Bruno", 50.0, 20.0);
		
		//Downcasting
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(10.0);
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {//se account(acc3) for do tipo BusinessAccount entao...
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(15.0);
			System.out.println("BusinessAccount");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("SavingsAccount");
		}
	}

}
