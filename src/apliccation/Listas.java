package apliccation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // não aceita tipos primitivos, como int usar wrapper class integer

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // entrou na posição 2 sem prejudicar a lista

		System.out.println(list.size());

		for (String x : list) { // para cada string x pertencente a list vai imprimir na tela o x
			System.out.println(x);
		}
		System.out.println("------------------");
		// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M'); // usamos para remover tal predicado, começar com , etc
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("----------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// primeiro convrte p string, faz a operação lambda e depois tem que voltar para a lista, comando do .collect
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // vai pegar o primeiro elemento, se não existir, retorna nulo
		System.out.println(name);
	}
}
