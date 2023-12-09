package apliccation;

import java.util.Locale;
import java.util.Scanner;

import entities.Salar;

public class Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salar salario = new Salar();
		
		System.out.println("Name: ");
		salario.name = sc.next();
		System.out.println("Gross salary: ");
		salario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.println("Funcionário: " + salario);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		salario.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + salario);
		sc.close();
	}

}
