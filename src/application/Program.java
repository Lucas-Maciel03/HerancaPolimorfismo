package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(01, "Ronaldo", 200.0);
		acc.withdraw(45.0);
		System.out.println(acc.getBalance());
		
		Account acc1 = new SavingsAccount(02, "Lory", 100.0, 40.0);
		acc1.withdraw(12.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new BusinessAccount(03, "Lucas", 1000.0, 600.0);
		acc2.withdraw(100.0);
		System.out.println(acc2.getBalance());
	}

}
