package apliccation;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class ProgramRent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent# " + i + ":");
			System.out.println("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int numquarto = sc.nextInt();

			vect[numquarto] = new Rent(name, email); // instanciamos na classe um tamanho de vetor, e a variavel do
														// numero do quarto entra no indice do vetor

		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i <= 9; i++) {
			if (vect[i] != null)
				System.out.println(i+1 + " : " + vect[i]);
		}

		sc.close();
	}

}
