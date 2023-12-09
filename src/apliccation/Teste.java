package apliccation;

import java.util.Scanner;
import	entities.Abab;
public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		Abab teste1 = new Abab(nome, idade, salario);
		System.out.println(teste1);
		
		System.out.println("Deseja alterar o nome do usuário? (y/n) ");
        char response = sc.next().charAt(0);
        if(response == 'y') {
        	System.out.println("Digite o novo nome: ");
        	String novonome = sc.next();
        	teste1.setNome(novonome);
        	
        	String nomeAtualizado = teste1.getNome();
            System.out.println("Novo nome: " + nomeAtualizado);
        }
        System.out.println("Deseja alterar a idade? (y/n) ");
        response = sc.next().charAt(0);
        if(response == 'y') {
        	System.out.println("Digite a nova idade: ");
        	 int novaidade = sc.nextInt();
        	teste1.setIdade(novaidade);
        	
        	int idadeatualizada = teste1.getIdade();
        	System.out.println("Nova idade: " + idadeatualizada);
        }
        System.out.println("Com base na sua evolução, você recebeu um aumento... Digite o valor a seguir: ");
        double aumento = sc.nextDouble();
        teste1.aumento(aumento);
        
        System.out.println("Salário após o reajuste: "+ teste1.getSalario());
        
        System.out.println("Devido a descumprimento de regras e condutas da empresa, você recebeu uma multa... Qual o valor? ");
        double despesa = sc.nextDouble();
        teste1.imposto(despesa);
        
        System.out.println("Seu salário após o pagamento: " + teste1.getSalario());
        System.out.println(teste1);
	}

}
