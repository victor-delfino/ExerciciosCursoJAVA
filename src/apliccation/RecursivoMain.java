package apliccation;

import java.util.Scanner;

import entities.MetodoRecursivo;

public class RecursivoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int b = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		int c = sc.nextInt();

		int soma = MetodoRecursivo.somaRecursiva(a, b, c);
		System.out.println("A soma dos números dados foi de: " + soma);

	}

}
