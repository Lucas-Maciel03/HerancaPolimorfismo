package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class AtvProduct {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.printf("Product #%d data: \n", i + 1);
			System.out.print("Common, used or imported (c/u/i)? ");

			char op = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (op == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			} else if (op == 'i') {
				System.out.print("Customs Fee: ");
				double custom = sc.nextDouble();
				Product product = new ImportProduct(name, price, custom);
				list.add(product);
			} else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
		} //fim for

		System.out.println("PRICE TAGS:");
		for (Product x : list) {
			System.out.println(x.priceTag());
		}
		sc.close();
	}

}
