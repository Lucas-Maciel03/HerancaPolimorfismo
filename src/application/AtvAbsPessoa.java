package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.AbsCompany;
import entities.AbsIndividual;
import entities.TaxPayer;

public class AtvAbsPessoa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			System.out.printf("Tax payer #%d data:\n", i+1);
			System.out.print("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				double expenditures = sc.nextDouble();
				list.add(new AbsIndividual(name, income, expenditures));
			}else {
				System.out.print("Number of Employees: ");
				int qtdEmp = sc.nextInt();
				list.add(new AbsCompany(name, income, qtdEmp));
			}
		}//fim for
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0.0;
		for(TaxPayer x : list) {
			System.out.println(x.getName() + ": " + "$" + String.format("%.2f", x.tax()));
			total = total + x.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));
		sc.close();
	}

}
