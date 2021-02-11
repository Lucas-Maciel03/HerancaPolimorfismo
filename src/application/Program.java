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
		
		//polimorfismo
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
	
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
