package apliccation;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CotaçãoDolar {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Preço do dolar?");
	double price = sc.nextDouble();
	System.out.print("Vai comprar quantos filhao?");
	double dollars = sc.nextDouble();
	double result = CurrencyConverter.total(price, dollars);
	
	System.out.printf("Quantidade a ser paga: %.2f%n", result);

	sc.close();
	}
}
