package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ExPolimorfismoEmp;
import entities.ExPolimorfismoOutSourced;

public class ExPolimorfismo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <ExPolimorfismoEmp> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.printf("Employee #%d data: \n", i+1);
			System.out.print("Outsourced (y/n)? ");
			char out = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours:");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double value = sc.nextDouble();
			
			if(out == 'y') {
				System.out.println("Additional Charge: ");
				double additional = sc.nextDouble();
				ExPolimorfismoEmp emp = new ExPolimorfismoOutSourced(name, hours, value, additional);
				list.add(emp);
			}
			else if(out == 'n') {
				ExPolimorfismoEmp emp = new ExPolimorfismoEmp(name, hours, value);
				list.add(emp);
			}			
		}//fim for
		
		System.out.println("Payments:");
		
		for(ExPolimorfismoEmp x : list) {
			System.out.println(x.getName() + " - $ " + String.format("%.2f", x.payment()));
		}
		
		sc.close();
	}

}
