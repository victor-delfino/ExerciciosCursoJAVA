package apliccation;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import entities.Listas;

public class MainList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		List<Double> list2 = new ArrayList<>();
		
		System.out.println("Quantos empregados serão registrados? ");
		int registro = sc.nextInt();

		for (int i = 0; i < registro; i++) {
			System.out.println("Digite o id ");
			int id = sc.nextInt();

			boolean idduplicado = false; // logica para verificar se o id existe dentro do arraylist
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == id) {
					idduplicado = true;
					System.out.println("id registrado, tente novamente");
					break;
				}
			}
			if (idduplicado) {
				i--;
				continue;
			}
			/* if (list.contains(id)) {
                System.out.println("ID já registrado, tente novamente.");
                i--;
                continue;
            }

            list.add(id); */

			list.add(id);

			System.out.println("Digite o nome: ");
			String nome = sc.next();
			list1.add(nome);

			System.out.println("Digite o salário: ");
			Double salario = sc.nextDouble();
			list2.add(salario);
		}

		System.out.println("Digite o id do funcionário para aumento: ");
		int id = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i)) {
				double novosalario = list2.get(i) * 1.1;
				list2.set(i, novosalario);
				System.out.println("Aumento aplicado com sucesso.");
				break;
			}

		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Lista de funcionários: #" + i);
			System.out.println(list.get(i));
			System.out.println(list1.get(i));
			System.out.println(list2.get(i));
		}
	}
}
